package net.mindview.chapter12;

public class ExceptionThrower {
    void throwExceptions() throws ExceptionTypeOne, ExceptionTypeTwo, ExceptionTypeThree {
        throw new ExceptionTypeOne();
//        throw new ExceptionTypeTwo();
//        throw new ExceptionTypeThree();
    }

    public static void main(String[] args) {
        ExceptionThrower et = new ExceptionThrower();
        try {
            et.throwExceptions();
        } catch (ExceptionTypeOne | ExceptionTypeTwo | ExceptionTypeThree exceptionTypeOne) {
            exceptionTypeOne.printStackTrace();
        }
    }
}
