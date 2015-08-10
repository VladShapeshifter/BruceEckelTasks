package net.mindview.chapter12;

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("animal, not plant");
    Animal() {
        System.out.println("Animal()");
    }
    @Override
    protected void dispose() {
        System.out.println("dispose() in the Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
