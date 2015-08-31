package net.mindview.chapter13;

//import
import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// class ClassAnalysis
public class ClassAnalysis {
    //method read()
    public static void read(String path) {
        Pattern p = java.util.regex.Pattern.compile("//\\s?\\w+.*");
        Matcher m = p.matcher("");
        for (String s : new TextFile(path)) {
            m.reset(s);
            while (m.find()) {
                System.out.println(m.group());
            }
        }
    }
//main method
    public static void main(String[] args) {
        read("C:\\JavaProjects\\BruceEckelTasks\\src\\net\\mindview\\chapter13\\ClassAnalysis.java");
    }
}
