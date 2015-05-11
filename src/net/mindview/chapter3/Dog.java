package net.mindview.chapter3;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        System.out.println(spot.name = "Pudge");
        System.out.println(spot.says = "Hello, brother!");
        Dog scruffy = new Dog();
        System.out.println(scruffy.name = "Ralf");
        System.out.println(scruffy.says = "Hi!");
        Dog doggy = new Dog();
        doggy = spot;
        System.out.println(doggy == spot);
        System.out.println(doggy.equals(spot));
        System.out.println(doggy.name.equals(spot.name));
        System.out.println(doggy.name);
    }
}
