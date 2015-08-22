package net.mindview.chapter13;

public class Pattern {
    public static void main(String[] args) {
        String s = "How do you do? This is my new message to all people from my computer. Hello! My name is Vlad.";
        System.out.println("Sentence matches Upper Case and point: " +
                s.matches("\\p{javaUpperCase}.+[.]"));
        System.out.println("Sentence matches Upper Case and point: " +
                s.matches("\\p{javaUpperCase}.+[?]"));
    }
}
