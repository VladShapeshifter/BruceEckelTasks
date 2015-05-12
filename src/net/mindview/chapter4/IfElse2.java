package net.mindview.chapter4;

public class IfElse2 {
    static String test(int begin, int end, int testval, int target) {
        String temp = "";
        if (begin <= testval && testval <= end) {
            if (testval > target) {
                temp = "1";
            } else if (testval < target) {
                temp = "-1";
            }
        } else temp = "first number doesn't correspond numerical range";
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(test(0, 10, 3, 6));
        System.out.println(test(3, 4, 5, 1));
        System.out.println(test(-2, 0, 0, 1));
    }
}
