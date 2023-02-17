package com.sc.test.logger.jul;

import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author: sc
 * @version: 1.0
 * @description: jul：Java原生日志框架，不需要引入第三方依赖包，使用简单方便。
 *
 * https://zhuanlan.zhihu.com/p/505339189
 *
 * @date: 2023/1/6 10:51
 */
public class Main {
    public static void main(String[] args) {
        try{
            Class<Main> mainClass = Main.class;
            // 读取配置文件
            // 也可以通过使用java.util.logging.config.file系统属性指定文件名
            // 例如 java -Djava.util.logging.config.file=myfile
            InputStream resourceAsStream = mainClass.getClassLoader().getResourceAsStream("logging.properties");
            // 获取LogManager
            LogManager logManager = LogManager.getLogManager();
            // 记载配置文件
            logManager.readConfiguration(resourceAsStream);

            // 获取日志记录器对象
            Logger logger = Logger.getLogger(mainClass.toString());
            // 日志记录输出
            logger.severe("severe>>>>> sc");
            logger.warning("warning>>>>> sc");
            logger.info("info>>>>> sc");
            logger.config("config>>>>> sc");
            logger.fine("fine>>>>> sc");
            logger.finer("finer>>>>> sc");
            logger.finest("finest>>>>> sc");

            // 获取日志记录器对象
            Logger scLogger = Logger.getLogger("com.sc.test.useLog.jul");
            // 日志记录输出
            scLogger.severe("severe>>>>> scLogger");
            scLogger.warning("warning>>>>> scLogger");
            scLogger.info("info>>>>> scLogger");
            scLogger.config("config>>>>> scLogger");
            scLogger.fine("fine>>>>> scLogger");
            scLogger.finer("finer>>>>> scLogger");
            scLogger.finest("finest>>>>> scLogger");
        } catch (Exception e) {

        }
    }
}
