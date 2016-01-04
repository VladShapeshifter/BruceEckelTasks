package net.mindview.chapter14.instruments;

public class InstrumentsMaintenance {
    void prepairInstruments(Instrument[] instr) {
        for (Instrument instrument : instr) {
            System.out.println(instrument.prepareInstrument());
        }
    }

    public static void main(String[] args) {
        InstrumentsMaintenance maintenance = new InstrumentsMaintenance();
        maintenance.prepairInstruments(new Instrument[] {new Flute(), new Guitar()});
    }
}
