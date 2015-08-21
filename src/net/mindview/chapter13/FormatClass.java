package net.mindview.chapter13;

public class FormatClass {
    int i = 9;
    long l = 9l;
    float f = 9f;
    double d = 9d;

    @Override
    public String toString() {
        return String.format("int:%d\nlong:%d\nfloat:%f\ndouble:%f", i, l, f, d);
    }

    public static void main(String[] args) {
        FormatClass formatClass = new FormatClass();
        System.out.println(formatClass);
    }
}
