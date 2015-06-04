package net.mindview.chapter9;

public class Reposition implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        char[] chars =  ((String)input).toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1) {
                newChars[i++] = chars[i];
                newChars[i--] = chars[i];
            }
        }
        return newChars.toString();
    }

    public static void main(String[] args) {
        Apply.process(new Reposition(), "abc");
    }
}
