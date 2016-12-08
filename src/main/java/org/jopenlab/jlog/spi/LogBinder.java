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

package org.jopenlab.jlog.spi;

import org.jopenlab.jlog.Log;

/**
 * The factory class that actually generates the Log instance. Implement this class to generate a unified Log
 *     class for different Log platforms
 */
public interface LogBinder {

    /**
     * Generates an instance of the log class for the particular logging platform
     * @param name the name of log class
     * @return an instance of log class
     */
    public Log getLog(String name);

    /**
     * The weight of the LogBinderImpl class. When there are multiple LogBinderImpl implementation class, LogFactory
     *     will be based on this value that the choice of which implementation class
     * @return
     */
    public int getWeight();

    /**
     * To determine whether the current logBinder available (dependent jar package exists)
     * @return whether the current logBinder available
     */
    public boolean isAvailable();
}
