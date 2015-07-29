package net.mindview.chapter12;

public class MyExnTest {
    public static void main(String[] args) {
        try {
            throw new MyExn1();
        } catch (MyExn1 myExn1) {
            myExn1.printStackTrace(System.out);
        }
        System.out.println();
        try {
            throw new MyExn2();
        } catch (MyExn2 myExn2) {
            myExn2.printStackTrace(System.out);
        }
    }
}
