package net.mindview.chapter9.meal;

public class Sandwich extends PortableLunch implements FastFood{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() {
        System.out.println("Sandwich()");
    }

    @Override
    public String toString() {
        return "Sandwich";
    }

    public static void main(String[] args) {
        Sandwich order1 =  new Sandwich();
        order1.cook();
        order1.wrap();
        order1.sell();
    }

    @Override
    public void cook() {
        System.out.println("Create Sandwich from " + b + " " + c + " " + l + " " + p);
    }

    @Override
    public void wrap() {
        System.out.println("Wrap " + this);
    }

    @Override
    public void sell() {
        System.out.println("Sell " + this);
    }
}
