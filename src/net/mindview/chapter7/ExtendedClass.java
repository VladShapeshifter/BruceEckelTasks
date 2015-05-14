package net.mindview.chapter7;

public class ExtendedClass extends BaseClass {
    ExtendedClass(String s) {
        super(s);
        System.out.println("This is message from extended class: " + s);
    }
    ExtendedClass() {
        super("extended class default constructor.");
    }

    public static void main(String[] args) {
        ExtendedClass ec = new ExtendedClass();
        ExtendedClass ec2 = new ExtendedClass("extended class constructor with arguments (string).");
    }
}
