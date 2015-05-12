package net.mindview.chapter5;

public class ConstructorArray {
    ConstructorArray(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        ConstructorArray ca1 = new ConstructorArray("one");
        ConstructorArray ca2 = new ConstructorArray("two");
        ConstructorArray ca3 = new ConstructorArray("three");
        ConstructorArray[] constructorArrays = new ConstructorArray[3];
        constructorArrays[0] = ca1;
        constructorArrays[1] = ca2;
        constructorArrays[2] = ca3;
    }
}
