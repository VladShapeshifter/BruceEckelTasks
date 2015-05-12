package net.mindview.chapter6.protectedFolder;

public class ProtectedExampleTest extends ProtectedExample {
    public static void main(String[] args) {
        ProtectedExampleTest.method();
        ProtectedExample pe = new ProtectedExample();
        pe.method();
    }
}
