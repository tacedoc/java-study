package com.sc.test.designPattern.test002;

import com.sc.test.designPattern.test002.factory.AFactory;
import com.sc.test.designPattern.test002.factory.BFactory;
import com.sc.test.designPattern.test002.factory.Factory;

/**
 * @author: sc
 * @version: 1.0
 * @description: 工厂模式
 * @date: 2023/1/3 15:34
 */
public class Main {
    public static void main(String[] args) {
        Factory aFactory = new AFactory();
        aFactory.create().show();

        Factory bFactory = new BFactory();
        bFactory.create().show();
    }
}
