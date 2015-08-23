package net.mindview.chapter13;

import java.util.Arrays;

public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest " +
            "tree in the forest... with... a herring!";

    public static void main(String[] args) {
        String[] splited = knights.split("the|you");
        System.out.println(Arrays.toString(splited));

        String knights2 = "";
        char[] chars = knights.toCharArray();
        for (char c : chars) {
            if (Character.toString(c).matches("a|e|i|o|u|A|E|I|O|U")) {
                knights2 += "_";
            } else {
                knights2 += Character.toString(c);
            }
        }
        System.out.println(knights2);
    }
}
