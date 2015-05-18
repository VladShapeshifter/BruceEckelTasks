package net.mindview.chapter7;

public class Beetle extends Insect {
    private int k = printInit("Field Beetle.k was initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Field static Beetle.x2 was initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
