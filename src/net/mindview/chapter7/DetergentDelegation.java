package net.mindview.chapter7;

public class DetergentDelegation {
    private Cleanser cleanser = new Cleanser();

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public void dilute() {
        cleanser.append(" DetergentDelegation.dilute()");
    }
    public void apply() {
        cleanser.append(" DetergentDelegation.apply()");
    }
    public void scrub() {
        cleanser.append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }
    public void foam() {
        cleanser.append(" foam()");
    }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Check base class.");
        Cleanser.main(args);
    }
}
