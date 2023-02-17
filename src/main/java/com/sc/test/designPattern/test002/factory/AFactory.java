package com.sc.test.designPattern.test002.factory;

import com.sc.test.designPattern.test002.entity.A;
import com.sc.test.designPattern.test002.entity.Product;

/**
 * @author: sc
 * @version: 1.0
 * @description:
 * @date: 2023/1/3 15:45
 */
public class AFactory implements Factory {
    @Override
    public Product create() {
        return new A();
    }
}
