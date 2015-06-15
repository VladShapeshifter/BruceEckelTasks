package net.mindview.chapter10.Upackage;

public class A {
    U uRef() {
        return new U() {
            @Override
            public void method1() {
                System.out.println("A method1()");
            }

            @Override
            public void method2() {
                System.out.println("A method2()");
            }

            @Override
            public void method3() {
                System.out.println("A method3()");
            }
        };
    }
}
