package net.mindview.chapter15;

public class GenericMethods {
    public <T, X, Z> void f(int i, T t, X x, Z z) {
        System.out.print(i + " : " + t.getClass().getName() + ", " + x.getClass().getName() + ", " + z.getClass().getName());
        System.out.println();
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(0, "", "", "");
        gm.f(1, 1, "", 'c');
        gm.f(2, 1.0, 0, "");
        gm.f(3, 1.0F, 'a', 11);
        gm.f(4, 'c', 's', "ddd");
        gm.f(5, gm, 11, 'x');
    }
}
