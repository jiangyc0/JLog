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

package org.jopenlab.jlog.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.jopenlab.jlog.Log;

/**
 * Created by jiangyc on 2016/12/8.
 */
public class Log4jLog implements Log {
    /** the log instance of log4j */
    private Logger logger;

    /**
     * initial the log4j log instance
     * @param name the name of log instance
     */
    public Log4jLog(String name) {
        this.logger = Logger.getLogger(name);
    }


    @Override
    public void fatal(String format, Object... args) {
        logger.fatal(String.format(format, args));
    }

    @Override
    public void fatal(Object o, Throwable t) {
        logger.fatal(o, t);
    }

    @Override
    public void fatal(Object o) {
        logger.fatal(o);
    }

    @Override
    public boolean isFatalEnable() {
        return logger.isEnabledFor(Level.FATAL);
    }

    @Override
    public void error(String format, Object... args) {
        logger.error(String.format(format, args));
    }

    @Override
    public void error(Object o, Throwable t) {
        logger.error(o, t);
    }

    @Override
    public void error(Object o) {
        logger.error(o);
    }

    @Override
    public boolean isErrorEnable() {
        return logger.isEnabledFor(Level.ERROR);
    }

    @Override
    public void warn(String format, Object... args) {
        logger.warn(String.format(format, args));
    }

    @Override
    public void warn(Object o, Throwable t) {
        logger.warn(o, t);
    }

    @Override
    public void warn(Object o) {
        logger.warn(o);
    }

    @Override
    public boolean isWarnEnable() {
        return logger.isEnabledFor(Level.WARN);
    }

    @Override
    public void info(String format, Object... args) {
        logger.info(String.format(format, args));
    }

    @Override
    public void info(Object o, Throwable t) {
        logger.info(o, t);
    }

    @Override
    public void info(Object o) {
        logger.info(o);
    }

    @Override
    public boolean isInfoEnable() {
        return  logger.isEnabledFor(Level.INFO);
    }

    @Override
    public void debug(String format, Object... args) {
        logger.debug(String.format(format, args));
    }

    @Override
    public void debug(Object o, Throwable t) {
        logger.debug(o, t);
    }

    @Override
    public void debug(Object o) {
        logger.debug(o);
    }

    @Override
    public boolean isDebugEnable() {
        return logger.isEnabledFor(Level.DEBUG);
    }

    @Override
    public void trace(String format, Object... args) {
        logger.trace(String.format(format, args));
    }

    @Override
    public void trace(Object o, Throwable t) {
        logger.trace(o, t);
    }

    @Override
    public void trace(Object o) {
        logger.trace(o);
    }

    @Override
    public boolean isTraceEnable() {
        return logger.isEnabledFor(Level.TRACE);
    }
}
