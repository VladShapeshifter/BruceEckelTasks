package net.mindview.chapter14.proxy;

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        long timeout1 = System.currentTimeMillis();
        consumer(new RealObject());
        timeout1 = System.currentTimeMillis() - timeout1;
        long timeout2 = System.currentTimeMillis();
        consumer(new SimpleProxy(new RealObject()));
        timeout2 = System.currentTimeMillis() - timeout2;
        System.out.println("Without proxy: " + timeout1);
        System.out.println("With proxy: " + timeout2);
    }
}
