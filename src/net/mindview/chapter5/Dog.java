package net.mindview.chapter5;

public class Dog {
    void bark() {}
    void bark(char ch) {
        System.out.println("char - barking");
    }
    void bark(byte b) {
        System.out.println("byte - whining");
    }
    void bark(short sh) {
        System.out.println("short - roar");
    }
    void bark(int i) {
        System.out.println("int - gaf");
    }
    void bark(long l) {
        System.out.println("long - howl");
    }
    void bark(float f) {
        System.out.println("float - squeak");
    }
    void bark(double d) {
        System.out.println("double - bite");
    }
    void bark(double d, float f) {
        System.out.println("double, float - kick");
    }
    void bark(float f, double d) {
        System.out.println("float, double - peep");
    }
    Dog fff() {
        return this;
    }
    void ggg() {}
    public static void main(String[] args) {
        Dog spyke = new Dog();
        spyke.bark();
        spyke.bark('c');
        spyke.bark((byte)1);
        spyke.bark((short)1);
        spyke.bark(111);
        spyke.bark(222l);
        spyke.bark(333f);
        spyke.bark(444d);
        spyke.bark(111d, 111f);
        spyke.bark(111f, 111d);
    }
    void gaf() {
        Dog kelly = new Dog();
        //Break ddd = this.fff();  //демонстрация работы this - ссылка на текущий объект через метод, здесь объекты не совпадают, т.к. они относятся к разным классам
        Dog dog = this.fff(); // а здесь объекты относятся к одному и тому же классу
    }
//    Dog ddd = this.ggg();
}
