package net.mindview.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = "Storage";
        Pattern p = Pattern.compile("\\b[Ssct]\\w+");
        Matcher m = p.matcher(s);
        m.reset("System.out.println(\"Usage: java JGrep file regex\");");
        while (m.find())
        System.out.println(m.group());
    }
}
