package net.mindview.chapter5;

public class DefaultConstructor {
    DefaultConstructor() {
        System.out.println("Default constructor.");
    }
    DefaultConstructor(String s) {
        System.out.println("Default constructor " + s);
    }

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        DefaultConstructor defaultConstructor1 = new DefaultConstructor("111");
    }
}
