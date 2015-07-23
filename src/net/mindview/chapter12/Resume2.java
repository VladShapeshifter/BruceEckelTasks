package net.mindview.chapter12;

public class Resume2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        boolean status = false;
        int max = 5;
        while (!status) {
            try {
                for (int i = 0; i < max; i++) {
                    if (ints.length == max) {
                        status = true;
                        System.out.println(ints[i]);
                    } else {
//                        int redundant = ints[i];
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error, max is: " + max--);
            }
        }
    }
}
