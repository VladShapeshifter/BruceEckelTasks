package net.mindview.chapter10;

public interface NestedInterface2 {
    String method2();
    String method3();
    class InnerClass {
        static void method1(NestedInterface2 ni2) {
            System.out.println(ni2.method2());
            System.out.println(ni2.method3());
        }
    }
}
