package net.mindview.chapter11;

import java.util.*;

public class VowelLetterCounter {
    void count(String words) {
        int totalVowels = 0;
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "A a E e I i O o U u".split(" "));
        /*Count vowels in words*/
        ArrayList<String> inputWords = new ArrayList<>(Arrays.asList(words.split(" ")));
        for (String word : inputWords) {
            int wordVowels = 0;
            char[] letterChar = word.toCharArray();
            ArrayList<String> letterList = new ArrayList<>();
            for (char c : letterChar) {
                letterList.add(Character.toString(c));
            }
//            Set<String> letterSet = new HashSet<>(); // for unique vowels counting
//            letterSet.addAll(letterList);
            Iterator<String> it = letterList.iterator();
            while (it.hasNext()) {
                String letter = it.next();
                if (vowels.contains(letter)) {
                    wordVowels++;
                }
            }
            System.out.println("Word: \"" + word + "\", has " + wordVowels + " vowels;");
        }
        /*Count vowels in total sentence*/
        char[] letterChar = words.toCharArray();
        ArrayList<String> letterList = new ArrayList<>();
        for (char c : letterChar) {
            letterList.add(Character.toString(c));
        }
        for (String letter : letterList) {
            if (vowels.contains(letter)) {
                totalVowels++;
            }
        }
        System.out.println("Total vowels in the sentence is: " + totalVowels);
    }

    public static void main(String[] args) {
        VowelLetterCounter words = new VowelLetterCounter();
        words.count("Words in the sentence");
    }
}
