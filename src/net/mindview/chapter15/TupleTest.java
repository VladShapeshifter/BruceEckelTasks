package net.mindview.chapter15;

public class TupleTest {
    static SixTuple<Vehicle,Amphibian,String,Integer,Double,String> l() {
        return new SixTuple<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1, "12twelve");
    }

    public static void main(String[] args) {
        SixTuple<Vehicle,Amphibian,String,Integer,Double,String> sixt = l();
        System.out.println(sixt);
    }
}
