package net.mindview.chapter3;

public class Literals {
    public static void main(String[] args) {
        long l1 = 0x2f;
        System.out.println(Long.toBinaryString(l1));
        long l2 = 0X02;
        System.out.println(Long.toBinaryString(l2));
        long l3 = 0177;
        System.out.println(Long.toBinaryString(l3));
        long l4 = 0001;
        System.out.println(Long.toBinaryString(l4));
    }
}
