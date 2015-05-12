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
//        b = 2; // ������ ������������ ������������� ����/����� � ����������� ������
    }
    void method2() {
        a = 2; // ����� �������� ��� �����������
        b = 3; // ��� � ������������� ����/������
        method1();
        method2();
    }
    static void method3() {
        method1(); // ����� �������� ����������� ����� �� ������������ ������
//        method2(); // �� �� ����������� - ������
    }
}
