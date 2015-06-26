package net.mindview.chapter11;

import java.util.ArrayList;

public class Gerbil {
    private static int counter;
    private final int gerbilNumber;
    Gerbil() {
        gerbilNumber = counter++;
    }
    void hop() {
        System.out.println("Gerbil Number is " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Gerbil());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((Gerbil)arrayList.get(i)).hop();
        }
    }
}
