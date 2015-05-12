package net.mindview.chapter6;

public class ValTest {
    public static void main(String[] args) {
        VariousAccessLevel val = new VariousAccessLevel();
//        System.out.println(val.i);
        System.out.println(val.a);
        val.dMethod();
        System.out.println(val.f);
    }

}
