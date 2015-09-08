package net.mindview.chapter14;

public class PrimitiveOrObject {
    /*static void define(Character[] ch) {
        System.out.println("True object");
    }
    static void define(char[] ch) {
        System.out.println("Simple type");
    }*/
    static void define(Object obj) {
        System.out.println(obj.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};
        define(characters);
        define(chars);
        define(chars);
    }
}
