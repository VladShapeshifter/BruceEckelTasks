package net.mindview.chapter11;

import net.mindview.util.TextFile;

import java.util.*;

public class ReadText {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>(new TextFile("C:\\JavaProjects\\BruceEckelTasks\\src\\net\\mindview\\chapter11\\text.txt", "\\W+"));
        System.out.println(words);
        Map<String, ArrayList<Integer>> wordsMap = new LinkedHashMap<>();
//        ArrayList<Integer> freq = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            ArrayList<Integer> pos = new ArrayList<>();
            if (wordsMap.containsKey(words.get(i))) {
                pos = wordsMap.get(words.get(i));
            }
            pos.add(i);
            wordsMap.put(words.get(i), new ArrayList<>(pos));
        }
        System.out.println(wordsMap);
    }
}
