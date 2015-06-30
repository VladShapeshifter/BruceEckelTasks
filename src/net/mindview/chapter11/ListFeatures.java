package net.mindview.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> numb = new ArrayList<>(7);
        numb.add(1);
        numb.add(3);
        numb.add(7);
        numb.add(2);
        numb.add(0);
        numb.add(9);
        numb.add(5);
        System.out.println("1: " + numb);
    }
}
