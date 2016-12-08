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

import java.util.logging.Level;

/**
 * Created by jiangyc on 2016/12/8.
 */
public class JdkLevel extends Level {
    /** resource bundle string */
    private static final String resourceBundleName = "org.jopenlab.jlog.jdk14.Base";

    /** fatel error */
    public static final Level FATEL = new JdkLevel("FATEL", 1100);

    /** error */
    public static final Level ERROR = new JdkLevel("ERROR", 1000);

    /** warning */
    public static final Level WARN = new JdkLevel("WARN", 900);

    /** info */
    public static final Level INFO = Level.INFO;

    /** debug */
    public static final Level DEBUG = new JdkLevel("DEBUG", 700);

    /** trace */
    public static final Level TRACE = new JdkLevel("TRACE", 500);

    protected JdkLevel(String name, int value) {
        super(name, value, resourceBundleName);
    }
}
