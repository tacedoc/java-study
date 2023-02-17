package com.sc.test.designPattern.test001.factory;

import com.sc.test.designPattern.test001.entity.A;
import com.sc.test.designPattern.test001.entity.B;
import com.sc.test.designPattern.test001.entity.Product;

/**
 * @author: sc
 * @version: 1.0
 * @description:
 * @date: 2023/1/3 15:31
 */
public class SimpleFactory {
    public static Product create(String name ) {
        switch (name) {
            case "A": return new A();
            case "B": return new B();
            default: return null;
        }
    }
}
