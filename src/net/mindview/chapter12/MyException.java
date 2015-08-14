package net.mindview.chapter12;

public class MyException extends RuntimeException {
    private String messege;
    MyException(String msg) {
        messege = msg;
    }
    void showMessege() {
        System.out.println(messege);
    }
}
