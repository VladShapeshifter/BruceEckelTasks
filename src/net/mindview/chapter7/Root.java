package net.mindview.chapter7;

public class Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(2);
    Component3 component3 = new Component3(3);
    Root(int i) {
        System.out.println("Root constructor");
    }
    void dispose() {
        System.out.println("Close Root");
    }
}
