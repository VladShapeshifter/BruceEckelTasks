package net.mindview.chapter6;

public class VariousAccessLevel {
    private int i = 0;
    String a = "a";
    protected void dMethod() {
        System.out.println("3.14");
    }
    public float f = 14;

    public static void main(String[] args) {
        VariousAccessLevel val = new VariousAccessLevel();
        System.out.println(val.i);
        System.out.println(val.a);
        val.dMethod();
        System.out.println(val.f);

    }
}
