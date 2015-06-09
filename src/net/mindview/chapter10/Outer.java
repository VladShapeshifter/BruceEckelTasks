package net.mindview.chapter10;

public class Outer {
    Inner classref() {
        return new Inner();
    }
    class Inner {

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.classref();
    }
}
