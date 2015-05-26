package net.mindview.chapter8.polymorph;

public class Vehicle {
    void move() {
        System.out.println(destination());
    }
    String destination() {
        return "Street";
    }
}
