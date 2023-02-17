package com.sc.test.logger.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: sc
 * @version: 1.0
 * @description: log4j2
 *
 * <dependency>
 *     <groupId>org.apache.logging.log4j</groupId>
 *     <artifactId>log4j-core</artifactId>
 *     <version>2.19.0</version>
 * </dependency>
 * <dependency>
 *     <groupId>org.apache.logging.log4j</groupId>
 *     <artifactId>log4j-api</artifactId>
 *     <version>2.19.0</version>
 * </dependency>
 *
 * @date: 2023/1/6 14:28
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

            logger.debug("debug level");
            logger.info("info level");
            logger.warn("warn level");
            logger.error("error level");
            logger.error("字符串拼接一：{},记录main执行","logger");
            logger.error("字符串拼接二：" + "logger");
    }
}
