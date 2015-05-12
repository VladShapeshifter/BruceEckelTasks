package net.mindview.chapter5;

public class VarArgs2 {
    public static void main(Object... args) {
        for (Object object : args) {
            System.out.println(object);
        }
    }
}
