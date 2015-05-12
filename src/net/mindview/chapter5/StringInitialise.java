package net.mindview.chapter5;

public class StringInitialise {
    String s;
    {
        s = new String("string");
    }

    public static void main(String[] args) {
        StringInitialise si = new StringInitialise();
        System.out.println(si.s);
    }
}
