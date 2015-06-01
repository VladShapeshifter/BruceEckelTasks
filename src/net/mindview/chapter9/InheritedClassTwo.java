package net.mindview.chapter9;

public class InheritedClassTwo extends AbstractClass {
    void method1() {
        System.out.println("method1");
    }
    static void method2(AbstractClass ac) {
//        ((InheritedClassTwo)ac).method1();
        ac.method1();
    }

    public static void main(String[] args) {
        InheritedClassTwo ic2 = null;
        AbstractClass ac = new InheritedClassTwo();
        ic2.method2(ac);
    }
}
