package net.mindview.chapter15;

import net.mindview.chapter14.coffee.Generator;

public class Fibonacci implements Generator<Integer> {
    int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }
    int fib(int n) {
        if (n < 2) return 1;
        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");
    }
}
