/*
 * Copyright (c) 2016. jiangyc <710183940@qq.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jopenlab.jlog;

import org.jopenlab.jlog.spi.LogBinder;

import java.util.ServiceLoader;

/**
 * Created by jiangyc on 2016/12/8.
 */
public class LogFactory {
    /**
     * all the implementation classes for LogBinderImpl.
     */
    private static ServiceLoader<LogBinder> logBinders = null;
    /** current logBinder */
    private static LogBinder logBinder = null;

    /**
     * Generates a Log instance, using the given class name as the name of the log class
     * @param c the class that as the name of log
     * @return a log implementation
     * @see LogBinder#getLog(String)
     */
    public static Log getLog(Class<?> c) {
        return getLog(c.getName());
    }

    /**
     * Generates a Log instance, using the given string as the name of the log class
     * @param name the given log name
     * @return a log implementation
     * @see LogBinder#getLog(String)
     */
    private static Log getLog(String name) {
        if (logBinder == null) {
            loadLogBinders();
        }

        if (logBinder == null) {
            throw new UnsupportedOperationException("can not find an implementation class.");
        }

        return logBinder.getLog(name);
    }

    /**
     * Loads all the implementation classes for LogBinderImpl.
     */
    static void loadLogBinders() {
        // load all implementation classes for LogBinderImpl
        logBinders = ServiceLoader.load(LogBinder.class);
        // find the best implementation class
        for (LogBinder tmp : logBinders) {
            if (!tmp.isAvailable()) {
                continue;
            }
            logBinder = (logBinder == null || tmp.getWeight() > logBinder.getWeight()) ? tmp : logBinder;
        }
    }
}
