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

/**
 * This class is the interface class for all Logs, defining some basic methods that log should have.
 *
 * <P>This class divides the log into six levels：</P>
 * <ul>
 *     <li>FATEL</li>
 *     <li>ERROR</li>
 *     <li>WARN</li>
 *     <li>INFO</li>
 *     <li>DEBUG</li>
 *     <li>TRACE</li>
 * </ul>
 * <p>The six levels from high to low: FATEL, ERROR, WARN, INFO, DEBUG, TRACE. The FATEL level is the highest,
 *     and only fatal error messages are output</p>
 */
public interface Log {

    /**
     * output a fatal message with a formatted string using the specified format string and arguments.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args formatter argument
     * @see String#format(String, Object...)
     */
    public void fatal(String format, Object... args);

    /**
     * output a fatal message with giving throwables
     * @param o fatal message
     * @param t throwable
     */
    public void fatal(Object o, Throwable t);

    /**
     * output a fatal message
     * @param o fatal message
     */
    public void fatal(Object o);

    /**
     * Whether the current log level supports outputting FATEL information
     * @return Whether to support the output FATEL information
     */
    public boolean isFatalEnable();

    /**
     * output an error message with a formatted string using the specified format string and arguments.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args formatter argument
     * @see String#format(String, Object...)
     */
    public void error(String format, Object... args);

    /**
     * output a error message with giving throwables
     * @param o error message
     * @param t throwable
     */
    public void error(Object o, Throwable t);

    /**
     * output a error message
     * @param o error message
     */
    public void error(Object o);

    /**
     * Whether the current log level supports outputting ERROR information
     * @return Whether to support the output ERROR information
     */
    public boolean isErrorEnable();

    /**
     * output a warn message with a formatted string using the specified format string and arguments.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args formatter argument
     * @see String#format(String, Object...)
     */
    public void warn(String format, Object... args);

    /**
     * output a warn message with giving throwables
     * @param o warn message
     * @param t throwable
     */
    public void warn(Object o, Throwable t);

    /**
     * output a warn message
     * @param o warn message
     */
    public void warn(Object o);

    /**
     * Whether the current log level supports outputting WARNNING information
     * @return Whether to support the output WARNNING information
     */
    public boolean isWarnEnable();

    /**
     * output a info message with a formatted string using the specified format string and arguments.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args formatter argument
     * @see String#format(String, Object...)
     */
    public void info(String format, Object... args);

    /**
     * output a info message with giving throwables
     * @param o info message
     * @param t throwable
     */
    public void info(Object o, Throwable t);

    /**
     * output a info message
     * @param o info message
     */
    public void info(Object o);

    /**
     * Whether the current log level supports outputting INFO information
     * @return Whether to support the output INFO information
     */
    public boolean isInfoEnable();

    /**
     * output a debug message with a formatted string using the specified format string and arguments.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args formatter argument
     * @see String#format(String, Object...)
     */
    public void debug(String format, Object... args);

    /**
     * output a debug message with giving throwables
     * @param o debug message
     * @param t throwable
     */
    public void debug(Object o, Throwable t);

    /**
     * output a debug message
     * @param o debug message
     */
    public void debug(Object o);

    /**
     * Whether the current log level supports outputting DEBUG information
     * @return Whether to support the output DEBUG information
     */
    public boolean isDebugEnable();

    /**
     * output a trace message with a formatted string using the specified format string and arguments.
     * @param format A <a href="../util/Formatter.html#syntax">format string</a>
     * @param args formatter argument
     * @see String#format(String, Object...)
     */
    public void trace(String format, Object... args);

    /**
     * output a trace message with giving throwables
     * @param o trace message
     * @param t throwable
     */
    public void trace(Object o, Throwable t);

    /**
     * output a debug message
     * @param o debug message
     */
    public void trace(Object o);

    /**
     * Whether the current log level supports outputting TRACE information
     * @return Whether to support the output TRACE information
     */
    public boolean isTraceEnable();
}
