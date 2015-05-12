package net.mindview.chapter5;

public class OverloadedConstructors {
    OverloadedConstructors(String s) {
        System.out.println(s);
    }
    OverloadedConstructors() {
        this("String");
    }

    public static void main(String[] args) {
        OverloadedConstructors oc = new OverloadedConstructors();
    }
    static int a;
    int b;
    static void method1() {
//        b = 2; // нельзя использовать нестатическое поле/метод в статическом методе
    }
    void method2() {
        a = 2; // можно вызывать как статические
        b = 3; // так и нестатические поля/методы
        method1();
        method2();
    }
    static void method3() {
        method1(); // можно вызывать статический метод из статического метода
//        method2(); // но не статический - нельзя
    }
}
