package net.mindview.chapter14.toys;

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, MyNewInterface {
    FancyToy() {
        super(1);
    }
}
