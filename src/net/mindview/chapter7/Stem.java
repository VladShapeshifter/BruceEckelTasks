package net.mindview.chapter7;

public class Stem extends Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(2);
    Component3 component3 = new Component3(3);
    Stem(int i) {
        super(11);
        System.out.println("Stem constructor");
    }
    @Override
    void dispose() {
        System.out.println("Close Stem");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem = new Stem(22);
        stem.dispose();
    }

}
