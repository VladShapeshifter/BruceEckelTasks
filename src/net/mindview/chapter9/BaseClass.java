package net.mindview.chapter9;

public abstract class BaseClass {
    abstract void print();
    BaseClass() {
        print();
    }

    public static void main(String[] args) {
        InheritedClassOne ic1 = new InheritedClassOne();
        ic1.print();
    }
}
