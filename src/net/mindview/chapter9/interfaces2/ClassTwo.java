package net.mindview.chapter9.interfaces2;

public class ClassTwo extends AbstractClass implements InterCombined {
    @Override
    public void interComb() {

    }

    @Override
    public void interOne1() {

    }

    @Override
    public void interOne2() {

    }

    @Override
    public void interTwo1() {

    }

    @Override
    public void interTwo2() {

    }

    @Override
    public void interThree1() {

    }

    @Override
    public void interThree2() {

    }

    static void a(Inter1 a) {

    }
    static void b(Inter2 b) {

    }
    static void c(Inter3 c) {

    }
    static void d(InterCombined d) {

    }

    public static void main(String[] args) {
        ClassTwo two = new ClassTwo();
        a(two);
        b(two);
        c(two);
        d(two);
    }
}
