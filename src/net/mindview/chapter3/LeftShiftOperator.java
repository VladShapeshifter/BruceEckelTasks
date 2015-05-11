package net.mindview.chapter3;

public class LeftShiftOperator {
    public static void main(String[] args) {
        int i = 0x1f;
        System.out.println(Integer.toBinaryString(i));
        i <<= 5;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
    }

}
