package net.mindview.chapter10.controlSystem;

public class GreenhouseControlsNew extends GreenhouseControls {
    private boolean humidification = false;
    public class HumidifyOn extends Event {
        public HumidifyOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidification = true;
        }

        @Override
        public String toString() {
            return "Humidification is on";
        }
    }
    public class HumidifyOff extends Event {
        public HumidifyOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidification = false;
        }

        @Override
        public String toString() {
            return "Humidification is off";
        }
    }
}
