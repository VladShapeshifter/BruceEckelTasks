package net.mindview.chapter12;

public class ArrayException {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(nums[i]);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("No such element in the array");
            }

        }
    }
}
