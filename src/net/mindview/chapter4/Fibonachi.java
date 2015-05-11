package net.mindview.chapter4;

public class Fibonachi {
    static void fibo(int lim) {
        int prev = 1;
        int next = 1;
        System.out.print("1, ");
        for (int i = 1, j = 0; j < lim; /*i = prev + i*/) {
            i = next;
            System.out.print(i + ", ");
            next = i + prev;
            prev = i;
            j++;
        }
    }

    public static void main(String[] args) {
        fibo(5);
    }
}
