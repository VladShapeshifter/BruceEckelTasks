package net.mindview.chapter3;

public class RightShiftOperator {
    public static void main(String[] args) {
        int i = 0x10;
        System.out.println(Integer.toBinaryString(i));
        i >>= 1;
        System.out.println(Integer.toBinaryString(i));
        i >>= 1;
        System.out.println(Integer.toBinaryString(i));
        i >>= 1;
        System.out.println(Integer.toBinaryString(i));
        i >>= 1;
        System.out.println(Integer.toBinaryString(i));
    }
}
