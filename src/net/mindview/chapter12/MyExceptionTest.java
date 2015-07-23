package net.mindview.chapter12;

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyException("Text from MyException");
        } catch (MyException e) {
            e.showMessege();
        }
    }
}
