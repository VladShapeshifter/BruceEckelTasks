package net.mindview.chapter13;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static final String POEM =
            "Twas brillig, and the slithy toves\n" +
            "Did gyre and rimble in the wabe.\n" +
            "And  the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and the shun\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        /*Matcher m = Pattern.compile("(?m)(\\S+)\\s((\\S+)\\s+(\\S+))$").matcher(POEM);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++) {
                System.out.print("[" + m.group(j) + "]");
                System.out.println();
            }
        }*/
        int count = 0;
        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> wordsList2 = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\p{javaLowerCase}+");
        Matcher matcher = pattern.matcher(POEM);
        matcher.find();
        while (matcher.find()) {
            wordsList.add(matcher.group());
            if (!wordsList2.contains(matcher.group())) {
                wordsList2.add(matcher.group());
            }
        }
        /*while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
        System.out.println(wordsList);
        System.out.println("Total count: " + wordsList2.size() + " " + wordsList2);
    }
}
