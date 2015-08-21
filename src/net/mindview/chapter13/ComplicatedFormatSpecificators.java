package net.mindview.chapter13;

import java.util.Formatter;

public class ComplicatedFormatSpecificators {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        char c = 'a';
        f.format("Char:\n c:%c , b:%b , s:%s , h:%h\n", c, c, c, c);
        boolean b = true;
        f.format("Boolean:\n b: %b , s:%s , h:%h\n", b, b, b);
        int i = 123;
        f.format("Integer:\n d:%d , c:%c , b:%b , s:%s , x:%x , h:%h\n", i, i, i, i, i, i);
        double d = 3.14;
        f.format("Double:\n f:%f , e:%e , b:%b , s:%s , h:%h", d, d, d, d, d);
    }
}
