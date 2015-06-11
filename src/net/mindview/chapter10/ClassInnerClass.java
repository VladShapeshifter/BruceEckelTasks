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
    class Inner3 implements InterfaceInnerClass {
        @Override
        public void method1() {

        }
    }
    private class Inner2 implements InterfaceInnerClass {

        @Override
        public void method1() {

        }

    }
    InterfaceInnerClass method3() {
        return new Inner2();
    }



}
