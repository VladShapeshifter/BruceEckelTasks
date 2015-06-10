package net.mindview.chapter10;

public class FirstClass {
    private String string1 = "origin String";
    private String method1() {
        return string1;
    }
    class InnerCl {
        void changeString(String s) {
            string1 = s;
            method1();
        }
    }
    String method2() {
        FirstClass fc = new FirstClass();
        FirstClass.InnerCl incl = fc.new InnerCl();
        incl.changeString("new String");
        return fc.string1;
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.method1());
        System.out.println(firstClass.method2());
    }
}
