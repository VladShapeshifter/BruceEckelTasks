package net.mindview.chapter12;

public class ExceptionThrower {
    void throwExceptions() throws ExceptionTypeOne, ExceptionTypeTwo, ExceptionTypeThree {
//        throw new ExceptionTypeOne();
        throw new NullPointerException();
//        throw new ExceptionTypeTwo();
//        throw new ExceptionTypeThree();
    }

    public static void main(String[] args) {
        ExceptionThrower et = new ExceptionThrower();
        try {
            et.throwExceptions();
        } catch (ExceptionTypeOne | ExceptionTypeTwo | ExceptionTypeThree | NullPointerException exceptionTypeOne) {
            exceptionTypeOne.printStackTrace();
        } finally {
            System.out.println("This is always displays message.");
        }
    }
}
