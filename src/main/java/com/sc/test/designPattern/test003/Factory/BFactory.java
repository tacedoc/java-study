package com.sc.test.designPattern.test003.Factory;

import com.sc.test.designPattern.test003.entity.B;
import com.sc.test.designPattern.test003.entity.Product;

/**
 * @author: sc
 * @version: 1.0
 * @description:
 * @date: 2023/1/3 15:45
 */
public class BFactory implements AbstractFactory {
    @Override
    public Product create() {
        return new B();
    }
}
