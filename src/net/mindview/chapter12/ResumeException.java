package net.mindview.chapter12;

public class ResumeException extends ArrayIndexOutOfBoundsException {
    ResumeException(int k) {
        System.out.println("Error, max is: " + k);
    }
}
