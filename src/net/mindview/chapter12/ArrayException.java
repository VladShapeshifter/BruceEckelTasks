package net.mindview.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ArrayException {
    private static Logger logger = Logger.getLogger("No such element in the array");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(nums[i]);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("No such element in the array");
                logException(ae);
            }

        }
    }
}
