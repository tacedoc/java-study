package com.sc.test.designPattern.test010;

/**
 * @author: sc
 * @version: 1.0
 * @description: 装饰器模式
 *
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，相比生成子类更为灵活。
 *
 * （装饰器模式与继承对比：https://blog.csdn.net/qq_35551089/article/details/101558508）
 *
 * @date: 2023/1/4 13:52
 */
public class Main {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}

//抽象构件角色
interface Component {
    public void operation();
}
//具体构件角色
class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
//抽象装饰角色
class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
//具体装饰角色
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}

