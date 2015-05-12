package net.mindview.chapter5;

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
