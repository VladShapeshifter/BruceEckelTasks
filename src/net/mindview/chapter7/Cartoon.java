package net.mindview.chapter7;

public class Cartoon extends Drawing {
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        cartoon.i = 10;
        cartoon.s = "text";
        System.out.println(cartoon.i);
        System.out.println(cartoon.s);

    }
}
