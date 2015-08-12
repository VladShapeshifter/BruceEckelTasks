package net.mindview.chapter12;

public class FailingConstructorDispose {
    FailingConstructorDispose() throws MyException {
        throw new MyException("Exception was thrown");
    }
    void dispose() {
        System.out.println("FailingConstructorDispose class was disposed");
    }
}
