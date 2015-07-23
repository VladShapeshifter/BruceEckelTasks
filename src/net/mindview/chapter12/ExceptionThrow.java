package net.mindview.chapter12;

public class ExceptionThrow {
    public static void main(String[] args) {
        try {
            throw new Exception("This is Exception from main() method");
        } catch (Exception e) {
            System.out.println(e);
//            e.printStackTrace();
        } finally {
            System.out.println("This is finally block");
        }
    }
}
