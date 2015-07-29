package net.mindview.chapter12;

public class ExceptionSpecification {
    void method() throws MyException {
        throw new MyException("MyException thrown from method()");
    }

    public static void main(String[] args) {
        ExceptionSpecification es = new ExceptionSpecification();
        try {
            es.method();
        } catch (MyException e) {
            e.showMessege();
        }
    }
}
