package net.mindview.chapter13;

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
        String[] strings = {"package net.mindview.chapter13;", "System.out.println(args[0]);"};
        for (String line : strings) {
            m.reset("package net.mindview.chapter13;");
            while (m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}
