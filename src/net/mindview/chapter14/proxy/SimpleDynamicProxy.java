package net.mindview.chapter14.proxy;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        long timeout1 = System.currentTimeMillis();
        consumer(real);
        timeout1 = System.currentTimeMillis() - timeout1;

        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[] {Interface.class},
                new DynamicProxyHandler(real)
        );
        long timeout2 = System.currentTimeMillis();
        consumer(proxy);
        timeout2 = System.currentTimeMillis() - timeout2;
        System.out.println("Without dyn proxy: " + timeout1);
        System.out.println("With dyn proxy: " + timeout2);
    }
}
