package net.mindview.chapter14.factory;

public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
        System.out.println("-------------------------------------");
        GasFilter gasFilter = null;
        Part.addNewPart(gasFilter);
        for (int i = 0; i < 11; i++) {
            System.out.println(Part.createRandom());
        }
    }
}
