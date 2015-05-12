package net.mindview.chapter5;

public class StaticFields {
    static String sts1 = "static string first was initialised";
    static String sts2;
    static {
        sts2 = "static string second was initialised";
    }
    static void staticOut() {
        System.out.println(sts1);
        System.out.println(sts2);
    }

    public static void main(String[] args) {
        StaticFields.staticOut();
    }
}
