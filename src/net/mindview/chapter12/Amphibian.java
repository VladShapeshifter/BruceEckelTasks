package net.mindview.chapter12;

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in the water");
    private Description t = new Description("in the water and on the ground");
    Amphibian() {
        System.out.println("Amphibian()");
    }
    @Override
    protected void dispose() {
        System.out.println("dispose() in the Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
