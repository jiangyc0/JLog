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

import org.jopenlab.jlog.Log;
import org.jopenlab.jlog.LogFactory;
import org.junit.Test;

/**
 * Created by jiangyc on 2016/12/8.
 */
public class LogTest {

    @Test
    public void test() {
        Log log = LogFactory.getLog(org.jopenlab.jlog.jdk14.LogTest.class);

        System.out.println(log);
    }

    @Test
    public void testLog() {
        Log log = LogFactory.getLog(org.jopenlab.jlog.jdk14.LogTest.class);

        log.fatal("this is a fatel log.");
        log.error("this is an error log.");
        log.warn("this is a warn log.");
        log.info("this is an info log.");
        log.debug("this is a debug log.");
        log.trace("this is a trace log.");
    }
}
