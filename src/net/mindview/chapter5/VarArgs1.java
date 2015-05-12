package net.mindview.chapter5;

public class VarArgs1 {
    void method(Object... obj) {
        for (Object object : obj) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        VarArgs1 va1 = new VarArgs1();
        va1.method(new String("one"), new String("two"), new String("three"));

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String[] stringArray = {s1, s2, s3};
        va1.method(stringArray);
        va1.method(s1, s2, s3);

        va1.method(new String[]{new String("one1"), new String("two2"), new String("three3")});
    }
}
