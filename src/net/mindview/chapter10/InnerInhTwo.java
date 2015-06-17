package net.mindview.chapter10;

public class InnerInhTwo {
    class InnerTwo extends InnerInhOne.InnerOne {
        InnerTwo(InnerInhOne iio) {
            iio.super("String");

        }
    }
}
