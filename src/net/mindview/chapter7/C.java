package net.mindview.chapter7;

public class C extends A {
    B b;

    C(int i) {
        super(i);
    }

    public static void main(String[] args) {
        C c = new C(3);
    }
}
