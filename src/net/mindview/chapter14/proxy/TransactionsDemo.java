package net.mindview.chapter14.proxy;

import java.lang.reflect.Proxy;

public class TransactionsDemo {
    public static void consumer(Payment p) {
        p.makePayment();
    }

    public static void main(String[] args) {
        Transactions trans = new Transactions();
        Transactions trans1 = new Transactions();
        Payment proxy = (Payment) Proxy.newProxyInstance(
                Payment.class.getClassLoader(),
                new Class[] {Payment.class},
                new TransactionsProxyHandler(trans)
        );
        Payment proxy1 = (Payment) Proxy.newProxyInstance(
                Payment.class.getClassLoader(),
                new Class[] {Payment.class},
                new TransactionsProxyHandler(trans1)
        );
        consumer(proxy);
        consumer(proxy1);
    }
}
