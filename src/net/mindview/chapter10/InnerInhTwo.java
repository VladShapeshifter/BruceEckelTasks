package net.mindview.chapter10;

public class InnerInhTwo {
    class InnerTwo extends InnerInhOne.InnerOne {
        InnerTwo(InnerInhOne iio) {
            iio.super("String");

        }
    }
    /*void method(final int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        InnerInhTwo ii1 = new InnerInhTwo();
        InnerInhTwo ii2 = new InnerInhTwo();
        InnerInhTwo ii3 = new InnerInhTwo();
        ii1.method(1);
        ii1.method(2);
        ii1.method(3);
        ii2.method(1);
        ii2.method(2);
    }*/
}
