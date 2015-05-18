package net.mindview.chapter7;

public class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Field static Insect.x1 was initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
