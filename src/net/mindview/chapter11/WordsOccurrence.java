package net.mindview.chapter11;

import java.util.*;

public class WordsOccurrence {
    void count(String sentence, String words) {
//        Map<String, Integer> wordsFreq = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
//        Set<String> splitedWordsSet = new HashSet<>();
//        Collections.addAll(splitedWordsSet, words.split(" "));
        String[] splitedWords = words.split(" ");
//        Iterator<String> it = splitedWordsSet.iterator();
//        while (it.hasNext()) {
//            wordsFreq.put(it.next(), 0);
//        }
        Set<WordsStorage> wordsStorage = new HashSet<>();

        for (int i = 0; i < splitedWords.length; i++) {
//            wordsFreq.put(splitedWords[i], 0);
            wordsStorage.add(new WordsStorage(splitedWords[i], 0));
        }
        ArrayList<String> inputWords = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for (String word : inputWords) {
            Iterator<WordsStorage> it = wordsStorage.iterator();
            while (it.hasNext()) {
                WordsStorage wordsStorage1 = it.next();
                if (wordsStorage1.word.equals(word)) {
                    wordsStorage1.freq++;
                }
            }

            /*if (wordsFreq.containsKey(word)) {
                Integer freq = wordsFreq.get(word);
                wordsFreq.put(word, ++freq);
            }*/
        }
        System.out.println(wordsStorage);
    }

    public static void main(String[] args) {
        WordsOccurrence words = new WordsOccurrence();
        words.count("Java is the best programming language in the world Java Java", "Java best world");
    }
}
