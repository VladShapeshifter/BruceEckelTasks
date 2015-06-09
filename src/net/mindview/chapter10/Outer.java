package net.mindview.chapter10;

public class Outer {
    private String s;
    Outer() {
        s = "Outer constructor initialisation in Inner class using";
    }
    Inner classref() {
        return new Inner();
    }
    class Inner {
        @Override
        public String toString() {
            return s;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.classref();
        System.out.println(inner);
    }
}
