package net.mindview.chapter12;

class LivingCreature {
    private Characteristic p = new Characteristic("living creature");
    private Description t = new Description("simple living creature");
    LivingCreature() {
        System.out.println("LivingCreature()");
    }
    protected void dispose() {
        System.out.println("dispose() in the LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
