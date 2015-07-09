package net.mindview.chapter11;

import net.mindview.util.TextFile;

import java.util.*;

public class ReadText {
    String restoreBaseText(Map<String, ArrayList<Integer>> inputMap) {
        int maxPosValue = 0;
        String baseText = "";
        for (String word : inputMap.keySet()) {
            ArrayList<Integer> integers = inputMap.get(word);
            for (int i : integers) {
                if (i > maxPosValue) {
                    maxPosValue = i;
                }
            }
        }
        ArrayList<String> baseTextList = new ArrayList<>();
        for (int i = 0; i < maxPosValue + 1; i++) {
            baseTextList.add(i, "");
        }
        Set<String> words = new LinkedHashSet<>(inputMap.keySet());
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String word = it.next();
            ArrayList<Integer> pos = inputMap.get(word);
            for (int i : pos) {
                baseTextList.set(i, word);
            }
        }
        for (String word : baseTextList) {
            baseText = baseText + word + " ";
        }
        return baseText;
    }
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
        ReadText readText = new ReadText();
        System.out.println(readText.restoreBaseText(wordsMap));
    }
}
