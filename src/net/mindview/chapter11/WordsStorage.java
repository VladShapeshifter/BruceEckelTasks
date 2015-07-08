package net.mindview.chapter11;

public class WordsStorage {
    int freq;
    String word;
    WordsStorage(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Word: " + word + ", Frequency: " + freq + " ";
    }
    /*Map<String, Integer> wordsFreq = new TreeMap<>();
    WordsStorage(String word) {
        this.word = word;
        wordsFreq.put(word, 0);
    }
    void incFreq(String word) {
        wordsFreq.put(word, )
    }*/
}
