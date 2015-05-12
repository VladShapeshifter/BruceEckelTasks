package net.mindview.chapter5;

public class Tank {
    boolean isEmpty = true;
    Tank(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    void fill() {
        isEmpty = false;

    }
    void devastate() {
        isEmpty = true;
    }
    public void finalize() {
        if (isEmpty == false) {
            System.out.println("Tank is not empty yet!");
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank(false);
        tank.devastate();
        new Tank(false);
        System.gc();

    }
}
