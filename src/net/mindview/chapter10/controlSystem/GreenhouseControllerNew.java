package net.mindview.chapter10.controlSystem;

public class GreenhouseControllerNew {
    public static void main(String[] args) {
        GreenhouseControlsNew gc = new GreenhouseControlsNew();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new VentilationOn(1600),
                gc.new VentilationOff(1800),
                gc.new HumidifyOn(1850),
                gc.new HumidifyOff(1900)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1) {
            gc.addEvent(new GreenhouseControlsNew.Terminate(new Integer(args[0])));
        }
        gc.run();
    }

}
