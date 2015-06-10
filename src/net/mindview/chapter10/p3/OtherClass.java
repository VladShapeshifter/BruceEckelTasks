package net.mindview.chapter10.p3;

import net.mindview.chapter10.p2.OtherInterf;

public class OtherClass {
    protected class InnerClass implements OtherInterf {

        @Override
        public void method2() {

        }

        @Override
        public void method1() {

        }
    }
    protected InnerClass method3() {
        OtherClass oc = new OtherClass();
        return oc.new InnerClass();
    }
}
