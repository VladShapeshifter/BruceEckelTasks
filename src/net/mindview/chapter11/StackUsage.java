package net.mindview.chapter11;

import java.util.Objects;

public class StackUsage {
    void analyse(String exp) {
        char[] c = exp.toCharArray();
        String[] s = new String[c.length];
        for (int i = 0; i < c.length; i++) {
            s[i] = Character.toString(c[i]);
        }
        Stack<String> stack = new Stack();
        for (int i = 0; i < s.length; i++) {
            if (Objects.equals(s[i], "+")) {
                stack.push(s[++i]);
            } else if (Objects.equals(s[i], "-")) {
                System.out.print(stack.pop());
            } /*else {
                stack.push(s[i]);
            }*/
        }
//        System.out.println(Arrays.deepToString(s));
    }

    public static void main(String[] args) {
        StackUsage stackUsage = new StackUsage();
        stackUsage.analyse("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
