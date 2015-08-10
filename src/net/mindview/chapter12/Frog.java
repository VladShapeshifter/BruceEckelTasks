package net.mindview.chapter12;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("kvakaet");
    private Description t = new Description("eat bugs");
    public Frog() {
        System.out.println("Frog()");
    }
    @Override
    protected void dispose() {
        System.out.println("end Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            return;
        } finally {
            frog.dispose();
        }
    }
}
