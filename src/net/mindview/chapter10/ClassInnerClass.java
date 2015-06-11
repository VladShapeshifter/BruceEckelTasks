package net.mindview.chapter10;

public class ClassInnerClass {
    InterfaceInnerClass method2() {
        class Inner implements InterfaceInnerClass {

            @Override
            public void method1() {

            }
        }
        return new Inner();
    }


}
