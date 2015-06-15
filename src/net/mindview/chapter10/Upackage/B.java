package net.mindview.chapter10.Upackage;

public class B {
    U[] uArray = new U[2];
    int count = 0;
    void bReceice(U u) {
        if (count < uArray.length) {
            uArray[count++] = u;
        }
    }
    void bReset(int i) {
        uArray[i] = null;
    }
    void invoke() {
        for (int i = 0; i < uArray.length; i++) {
            if (uArray[i] != null) {
                uArray[i].method1();
                uArray[i].method2();
                uArray[i].method3();
            }
        }
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        B b1 = new B();
        b1.bReceice(a1.uRef());
        b1.bReceice(a2.uRef());
        b1.invoke();
        b1.bReset(1);
        b1.invoke();
    }
}
