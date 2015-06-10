package net.mindview.chapter10;

public class OuterAccessInner {
    int k = 10;
    class InnerAccess {
        private int i = 10;

        void method1() {
            k = 1;
        }
    }

    void method2() {
//        i = 1;
        OuterAccessInner oai = new OuterAccessInner();
        OuterAccessInner.InnerAccess ia = oai.new InnerAccess();
        ia.i = 1;
    }
}
