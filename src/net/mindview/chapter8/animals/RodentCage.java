package net.mindview.chapter8.animals;

public class RodentCage {
    public static void main(String[] args) {
        Hamster hamster = new Hamster();
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse(hamster);
        rodents[1] = new Mouse(hamster);
        rodents[2] = new Beaver(hamster);
        for (Rodent r : rodents) {
            r.gnaw(Meal.WOOD);
            System.out.println(r.info());
        }
    }
}
