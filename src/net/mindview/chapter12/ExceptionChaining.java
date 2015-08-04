package net.mindview.chapter12;

public class ExceptionChaining {
    void f() {
        try {
            g();
        } catch (ExceptionTypeOne exceptionTypeOne) {
            /*ExceptionTypeTwo ett = new ExceptionTypeTwo();
            ett.initCause(exceptionTypeOne);
            throw ett;*/
            throw new RuntimeException(exceptionTypeOne);
        }
    }
    void g() throws ExceptionTypeOne {
        throw new ExceptionTypeOne();
    }

    public static void main(String[] args) {
        ExceptionChaining chaining = new ExceptionChaining();
        /*try {
            chaining.f();
        } catch (ExceptionTypeTwo exceptionTypeTwo) {
            exceptionTypeTwo.printStackTrace();
        }*/
        chaining.f();
    }
}
