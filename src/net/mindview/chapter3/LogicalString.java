package net.mindview.chapter3;

public class LogicalString {
    String string;
    static void equalString(String s1, String s2) {
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
    }

    public static void main(String[] args) {
        String s1 = "qqq";
        String s2 = "ppp";
        equalString(s1, s2);
        LogicalString ls1 = new LogicalString();
        LogicalString ls2 = new LogicalString();
        ls1.string = "aaa";
        ls2.string = "bbb";
        ls2 = ls1;
        equalString(ls1.string, ls2.string);

    }
}
