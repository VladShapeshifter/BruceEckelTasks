package net.mindview.chapter3;

public class CharInBinary {
    static void charToBinary(char ch) {
        System.out.println(Integer.toBinaryString(ch));
    }

    public static void main(String[] args) {
        charToBinary('a');
    }
}
