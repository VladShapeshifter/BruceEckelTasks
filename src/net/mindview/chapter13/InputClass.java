package net.mindview.chapter13;

import java.util.Scanner;

public class InputClass {
    private int  i;
    private long l;
    private float f;
    private double d;
    private String s;
    InputClass(String s) {
        Scanner scan = new Scanner(s);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                i = scan.nextInt();
            } else if (scan.hasNextLong()) {
                l = scan.nextLong();
            } else if (scan.hasNextDouble()) {
                d = scan.nextDouble();
            } else if (scan.hasNextFloat()) {
                f = scan.nextFloat();
            } else if (scan.hasNextLine()){
                this.s = scan.next();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("int: " + i + "\n");
        sb.append("long: " + l + "\n");
        sb.append("float: " + f + "\n");
        sb.append("double: " + d + "\n");
        sb.append("String: " + s + "\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        InputClass inputClass = new InputClass("What? 10 10.2  12312312312 0.3  ");
        System.out.println(inputClass);
    }
}
