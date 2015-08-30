package net.mindview.chapter13;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        Matcher m = p.matcher("");

        Pattern pp = Pattern.compile("(?m).+\\.java$");
        Matcher mm = pp.matcher(args[0]);
        if (mm.find()) {
            for (String s : new TextFile(args[0])) {
                m.reset(s);
                while (m.find()) {
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }
        } else {
            File[] files = new File(args[0]).listFiles();
            String allFilesFromPath = Arrays.toString(files);
            String[] splitedPaths = allFilesFromPath.split(", ");
            for (String path : splitedPaths) {
                String normalPath = path.replaceAll("\\[", "").replaceAll("\\]", "");
                Pattern ppp = Pattern.compile("(?m).+\\.java$");
                Matcher mmm = ppp.matcher(normalPath);
                while (mmm.find()) {
                    for (String s : new TextFile(normalPath)) {
                        m.reset(s);
                        while (m.find()) {
                            System.out.println(index++ + ": " + m.group() + ": " + m.start());
                        }
                    }
                }
            }
        }
    }
}
