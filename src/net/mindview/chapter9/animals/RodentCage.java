package net.mindview.chapter9.animals;

public class RodentCage {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse(5);
        rodents[1] = new Hamster(8);
        rodents[2] = new Beaver(30);
        for (Rodent r : rodents) {
            r.gnaw(Meal.WOOD);
            System.out.println(r);
        }
    }
}