package net.mindview.chapter13.toys;

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, MyNewInterface {
    FancyToy() {
        super(1);
    }
}
