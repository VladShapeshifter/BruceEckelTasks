package net.mindview.chapter12;

public class B extends A {
    @Override
    void methodA() throws MediumException {
        System.out.println("methodA() class B");
        throw new MediumException();
    }
}
