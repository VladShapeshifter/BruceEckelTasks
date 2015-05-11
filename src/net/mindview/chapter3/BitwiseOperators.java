package net.mindview.chapter3;

public class BitwiseOperators {
    public static void main(String[] args) {
        int i1 = 3;
        System.out.println("i1: " + Integer.toBinaryString(i1));

        int i2 = 11;
        System.out.println("i2: " + Integer.toBinaryString(i2));
        System.out.println(" ");

        System.out.println("i1 | i2");
        int i3 = i1|i2;
        System.out.println(Integer.toBinaryString(i3));
        System.out.println(i3);
        System.out.println(" ");

        System.out.println("i1 & i2");
        int i4 = i1&i2;
        System.out.println(Integer.toBinaryString(i4));
        System.out.println(i4);
        System.out.println(" ");

        System.out.println("i1 ^ i2");
        int i5 = i1^i2;
        System.out.println(Integer.toBinaryString(i5));
        System.out.println(i5);
        System.out.println(" ");

        System.out.println("~i1");
        int i6 = ~i1;
        System.out.println(Integer.toBinaryString(i6));
        System.out.println(i6);
    }
}
