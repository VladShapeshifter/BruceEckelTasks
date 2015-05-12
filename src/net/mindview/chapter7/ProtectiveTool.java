package net.mindview.chapter7;

public class ProtectiveTool extends Detergent {
    @Override
    public void scrub() {
        append(" ProtectiveTool.scrub()");
        super.scrub();
    }
    public void sterilize() {
        append(" sterilize()");
    }
}
