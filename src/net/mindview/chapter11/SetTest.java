package net.mindview.chapter11;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        int wordVowels = 0;
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "A E I O U".split(" "));
        ArrayList<String> letterList = new ArrayList<>();//
        letterList.add("A");
        letterList.add("E");
        letterList.add("I");
        letterList.add("Y");
        Iterator<String> it = letterList.iterator();
        while (it.hasNext()) {
//            String letter = it.next();
            if (vowels.contains(it.next())) {
                wordVowels++;
            }
        }
        System.out.println(vowels.contains("O"));
        System.out.println(vowels.containsAll(letterList));
        System.out.println("Word: \"" +  "\", has " + wordVowels + " vowels;");

    }
}
