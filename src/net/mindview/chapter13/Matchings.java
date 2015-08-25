package net.mindview.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matchings {
    public static void main(String[] args) {
        String s = "Java now has regular expressions";
        String ss = "Arline ate eight apples and one orange while Anita hadn't any";
        String expr1 = "^Java";
        String expr2 = "\\Breg.*";
        String expr3 = "n.w\\s+h(a|i)s";
        String expr4 = "s?";
        String expr5 = "s*";
        String expr6 = "s+";
        String expr7 = "s{4}";
        String expr8 = "s{1}.";
        String expr9 = "s{0,3}";

        String someExpr = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";

        Pattern regex = Pattern.compile(someExpr);
        Matcher matcher = regex.matcher(ss);
        boolean b = matcher.find();
        System.out.println(b);
    }
}
