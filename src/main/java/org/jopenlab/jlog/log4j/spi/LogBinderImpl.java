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

package org.jopenlab.jlog.log4j.spi;

import org.jopenlab.jlog.Log;
import org.jopenlab.jlog.log4j.Log4jLog;
import org.jopenlab.jlog.spi.LogBinder;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jiangyc on 2016/12/8.
 */
public class LogBinderImpl implements LogBinder {
    /** the map to put all the Log */
    private Map<String, Log> logMap = new ConcurrentHashMap<>();

    @Override
    public Log getLog(String name) {
        Log log = logMap.get(name);

        if (log == null) {
            log = new Log4jLog(name);
            logMap.put(name, log);
        }

        return log;
    }

    @Override
    public int getWeight() {
        return 20;
    }

    @Override
    public boolean isAvailable() {
        try {
            return Class.forName("org.apache.log4j.Logger") != null;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
