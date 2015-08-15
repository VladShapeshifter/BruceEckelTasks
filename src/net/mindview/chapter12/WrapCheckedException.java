package net.mindview.chapter12;

public class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0: throw new Annoyance();
                case 1: throw new Sneeze();
                case 2: throw new RuntimeException("Where I am?");
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
