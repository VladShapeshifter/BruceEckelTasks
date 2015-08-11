package net.mindview.chapter12;

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException {

    }
    public StormyInning(String s) throws Foul, BaseballException {

    }
    @Override
    public void rainHard() throws RainedOut {

    }
    @Override
    public void event() {

    }
    @Override
    public void atBat() throws PopFoul {

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        }
    }
}
