package net.mindview.chapter13;

//import
import net.mindview.util.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// class ClassAnalysis
public class ClassAnalysis {
    //method read()
    public static void read(String path) {
        Pattern pp = Pattern.compile("(?m).+\\.java$");
        Matcher mm = pp.matcher(path);

        Pattern p = java.util.regex.Pattern.compile("//\\s?\\w+.*");
        Pattern p1 = java.util.regex.Pattern.compile("\\w+");
        Matcher m = p1.matcher("");
        if (mm.find()) {
            System.out.println("All literals from current class:");
            for (String s : new TextFile(path)) {
                m.reset(s);
                while (m.find()) {
                    System.out.println(m.group());
                }
            }
        } else {
            File[] files = new File(path).listFiles();
            String allFilesFromPath = Arrays.toString(files);
            String[] splitedPaths = allFilesFromPath.split(", ");
            for (String curPath : splitedPaths) {
                String normalPath = curPath.replaceAll("\\[", "").replaceAll("\\]", "");
                Pattern ppp = Pattern.compile("(?m).+\\.java$");
                Matcher mmm = ppp.matcher(normalPath);
                while (mmm.find()) {
                    System.out.println("\nAll literals from " + normalPath + " class:");
                    for (String s : new TextFile(normalPath)) {
                        m.reset(s);
                        while (m.find()) {
                            System.out.println(m.group());
                        }
                    }
                }
            }
        }
    }
//main method
    public static void main(String[] args) {
        read("C:\\JavaProjects\\BruceEckelTasks\\src\\net\\mindview\\chapter13");
    }
}
