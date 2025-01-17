/*
 * Copyright 2021 Alibaba Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.graphscope.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A main class demostrate the usage of GraphScopeAppScanner.
 */
public class Main {

    public static final boolean ignoreError = true;
    public static final boolean verbose = false;
    private static Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        if (args.length != 3) {
            logger.error("Expected 3 params.");
            return;
        }
        logger.info(
                "Files are generated in "
                        + GraphScopeAppScanner.scanAppAndGenerate(args[0], args[1], args[2]));
    }
}
