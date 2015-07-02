package net.mindview.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil());
        }
        Iterator<Gerbil> it = gerbils.iterator();
        while (it.hasNext()) {
            it.next().hop();
        }
    }
}
