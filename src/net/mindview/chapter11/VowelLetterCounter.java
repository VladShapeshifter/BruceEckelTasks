package net.mindview.chapter11;

import java.util.*;

public class VowelLetterCounter {
    void count(String words) {
        int totalVowels = 0;
        Set<String> vowels = new HashSet<>();
        Collections.addAll(vowels, "A a E e I i O o U u".split(" "));
        Map<String, Integer> letterFreq = new HashMap<>();
        letterFreq.put("A", 0);
        letterFreq.put("a", 0);
        letterFreq.put("E", 0);
        letterFreq.put("e", 0);
        letterFreq.put("I", 0);
        letterFreq.put("i", 0);
        letterFreq.put("O", 0);
        letterFreq.put("o", 0);
        letterFreq.put("U", 0);
        letterFreq.put("u", 0);
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
                Integer freq = letterFreq.get(letter);
                letterFreq.put(letter, ++freq);
                totalVowels++;
            }
        }
        System.out.println("Total vowels in the sentence is: " + totalVowels);
        System.out.println(letterFreq);
    }

    public static void main(String[] args) {
        VowelLetterCounter words = new VowelLetterCounter();
        words.count("Words in the sentence");
    }
}
