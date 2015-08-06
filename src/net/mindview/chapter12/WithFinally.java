package net.mindview.chapter12;

public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
            throw new RuntimeException();
        } catch (OnOffException2 | OnOffException1 onOffException2) {
            System.out.println(onOffException2);
        } finally {
            sw.off();
        }
    }
}
