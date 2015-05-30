package net.mindview.chapter8.transmogrify;

public class AlertStatus {
    private String status = "No panic.";
    public void statusOne() {
        status = "Attention!";
    }
    public void statusTwo() {
        status = "Warning!";
    }
    public void statusThree() {
        status = "Beware!";
    }

    @Override
    public String toString() {
        return status;
    }
}
