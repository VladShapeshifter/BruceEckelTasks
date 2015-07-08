package net.mindview.chapter11;

import java.util.*;

public class WordsOccurrence {
    void count(String sentence, String words) {
        Map<String, Integer> wordsFreq = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        String[] splitedWords = words.split(" ");
        for (int i = 0; i < splitedWords.length; i++) {
            wordsFreq.put(splitedWords[i], 0);
        }

        ArrayList<String> inputWords = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for (String word : inputWords) {
            if (wordsFreq.containsKey(word)) {
                Integer freq = wordsFreq.get(word);
                wordsFreq.put(word, ++freq);
            }
        }
        System.out.println(wordsFreq);
    }

    public static void main(String[] args) {
        WordsOccurrence words = new WordsOccurrence();
        words.count("Java is the best programming language in the world Java Java", "Java best world");
    }
}
