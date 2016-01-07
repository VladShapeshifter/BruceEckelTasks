package net.mindview.chapter15;

public class Holder4My<TestH4M> {
    TestH4M t1;
    TestH4M t2;
    TestH4M t3;

    public Holder4My(TestH4M t1, TestH4M t2, TestH4M t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public TestH4M getT1() {
        return t1;
    }

    public void setT1(TestH4M t1) {
        this.t1 = t1;
    }

    public TestH4M getT2() {
        return t2;
    }

    public void setT2(TestH4M t2) {
        this.t2 = t2;
    }

    public TestH4M getT3() {
        return t3;
    }

    public void setT3(TestH4M t3) {
        this.t3 = t3;
    }
}
