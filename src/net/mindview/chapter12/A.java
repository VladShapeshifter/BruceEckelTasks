package net.mindview.chapter12;

public class A {
    void methodA() throws SmallException {
        System.out.println("methodA() class A");
        throw new SmallException();
    }
}
