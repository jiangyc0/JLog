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

package org.jopenlab.jlog.jdk14;

import org.jopenlab.jlog.Log;

import java.util.logging.Logger;

/**
 * Created by jiangyc on 2016/12/8.
 */
public class JdkLog implements Log {
    /** jdk logger instance */
    private Logger logger;

    /**
     * initialize a Jdk Log with giving name
     * @param name
     */
    public JdkLog(String name) {
        this.logger = Logger.getLogger(name);
    }

    @Override
    public void fatal(String format, Object... args) {
        logger.log(JdkLevel.FATEL, String.format(format, args));
    }

    @Override
    public void fatal(Object o, Throwable t) {
        logger.log(JdkLevel.FATEL, (o == null) ? "" : o.toString(), t);
    }

    @Override
    public void fatal(Object o) {
        logger.log(JdkLevel.FATEL, (o == null) ? "" : o.toString());
    }

    @Override
    public boolean isFatalEnable() {
        return logger.getLevel().intValue() <= JdkLevel.FATEL.intValue();
    }

    @Override
    public void error(String format, Object... args) {
        logger.log(JdkLevel.ERROR, String.format(format, args));
    }

    @Override
    public void error(Object o, Throwable t) {
        logger.log(JdkLevel.ERROR, (o == null) ? "" : o.toString(), t);
    }

    @Override
    public void error(Object o) {
        logger.log(JdkLevel.ERROR, (o == null) ? "" : o.toString());
    }

    @Override
    public boolean isErrorEnable() {
        return logger.getLevel().intValue() <= JdkLevel.ERROR.intValue();
    }

    @Override
    public void warn(String format, Object... args) {
        logger.log(JdkLevel.WARN, String.format(format, args));
    }

    @Override
    public void warn(Object o, Throwable t) {
        logger.log(JdkLevel.WARN, (o == null) ? "" : o.toString(), t);
    }

    @Override
    public void warn(Object o) {
        logger.log(JdkLevel.WARN, (o == null) ? "" : o.toString());
    }

    @Override
    public boolean isWarnEnable() {
        return logger.getLevel().intValue() <= JdkLevel.WARN.intValue();
    }

    @Override
    public void info(String format, Object... args) {
        logger.log(JdkLevel.INFO, String.format(format, args));
    }

    @Override
    public void info(Object o, Throwable t) {
        logger.log(JdkLevel.INFO, (o == null) ? "" : o.toString(), t);
    }

    @Override
    public void info(Object o) {
        logger.log(JdkLevel.INFO, (o == null) ? "" : o.toString());
    }

    @Override
    public boolean isInfoEnable() {
        return logger.getLevel().intValue() <= JdkLevel.INFO.intValue();
    }

    @Override
    public void debug(String format, Object... args) {
        logger.log(JdkLevel.DEBUG, String.format(format, args));
    }

    @Override
    public void debug(Object o, Throwable t) {
        logger.log(JdkLevel.DEBUG, (o == null) ? "" : o.toString(), t);
    }

    @Override
    public void debug(Object o) {
        logger.log(JdkLevel.DEBUG, (o == null) ? "" : o.toString());
    }

    @Override
    public boolean isDebugEnable() {
        return logger.getLevel().intValue() <= JdkLevel.DEBUG.intValue();
    }

    @Override
    public void trace(String format, Object... args) {
        logger.log(JdkLevel.TRACE, String.format(format, args));
    }

    @Override
    public void trace(Object o, Throwable t) {
        logger.log(JdkLevel.TRACE, (o == null) ? "" : o.toString(), t);
    }

    @Override
    public void trace(Object o) {
        logger.log(JdkLevel.TRACE, (o == null) ? "" : o.toString());
    }

    @Override
    public boolean isTraceEnable() {
        return logger.getLevel().intValue() <= JdkLevel.TRACE.intValue();
    }
}
