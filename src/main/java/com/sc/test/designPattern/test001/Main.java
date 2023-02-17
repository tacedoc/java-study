package com.sc.test.designPattern.test001;

import com.sc.test.designPattern.test001.factory.SimpleFactory;

/**
 * @author: sc
 * @version: 1.0
 * @description: 简单工厂模式（静态工厂方法）
 * @date: 2023/1/3 15:31
 */
public class Main {
    public static void main(String[] args) {
        SimpleFactory.create("A").show();

        SimpleFactory.create("B").show();
    }
}
