package net.mindview.chapter7;

public class PostponedInitialization {
    static SimpleClass simpleClass;

    public static void main(String[] args) {
        System.out.println(simpleClass);
        if (simpleClass == null) {
            simpleClass = new SimpleClass();
        }
    }
}
