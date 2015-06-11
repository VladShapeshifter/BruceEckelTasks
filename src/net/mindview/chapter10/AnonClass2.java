package net.mindview.chapter10;

public class AnonClass2 {
    private String s;
    AnonClass2(String ss) {
        s = ss;
    }
    AnonClass method() {
        return new AnonClass(s) {

        };
    }

    public static void main(String[] args) {
        AnonClass2 ac2 = new AnonClass2("123");
        ac2.method();
    }
}
