package net.mindview.chapter5;

import java.util.Arrays;

public class StringObjArray {
    static String[] stringArray = new String[]{
            new String("one"),
            new String("two"),
            new String("three")
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(StringObjArray.stringArray));
    }
}
