package net.mindview.chapter13;

import java.util.Scanner;

public class InputClass {
    int  i;
    long l;
    float f;
    double d;
    String s;
    InputClass(String s) {
        Scanner scan = new Scanner(s);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                i = scan.nextInt();
            } else if ()
            System.out.println(scan.next());
        }
    }

    public static void main(String[] args) {
        InputClass inputClass = new InputClass("What is your name? 10 10.2 13.5f 50.4d 132424l String");
    }
}
