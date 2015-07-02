package net.mindview.chapter8.animals;

import java.util.ArrayList;
import java.util.Iterator;

public class RodentCage {
    public static void main(String[] args) {
        Hamster hamster = new Hamster();
        ArrayList<Rodent> rodents1 = new ArrayList<>();
        rodents1.add(new Mouse(hamster));
        rodents1.add(new Mouse(hamster));
        rodents1.add(new Beaver(hamster));
        Iterator<Rodent> it = rodents1.iterator();
        while (it.hasNext()) {
            it.next().gnaw(Meal.WOOD);
            System.out.println(it);
        }
        /*Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse(hamster);
        rodents[1] = new Mouse(hamster);
        rodents[2] = new Beaver(hamster);
        for (Rodent r : rodents) {
            r.gnaw(Meal.WOOD);
            System.out.println(r.info());
        }*/
    }
}
