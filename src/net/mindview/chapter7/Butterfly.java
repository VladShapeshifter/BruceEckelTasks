package net.mindview.chapter7;

public class Butterfly extends Beetle {
    static String s = "static string";
    private int g = 10;
    Butterfly() {
        System.out.println(s + g);
    }
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();
//        System.out.println(butterfly.s);
//        System.out.println(butterfly.g);
    }
}
