package com.sc.test.logger.log4j;

import org.apache.log4j.Logger;

/**
 * @author: sc
 * @version: 1.0
 * @description: log4j：
 *
 * <dependency>
 *     <groupId>log4j</groupId>
 *     <artifactId>log4j</artifactId>
 *     <version>1.2.17</version>
 * </dependency>
 *
 * @date: 2023/1/6 11:30
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录warn级别的信息
        logger.warn("This is warn message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}
