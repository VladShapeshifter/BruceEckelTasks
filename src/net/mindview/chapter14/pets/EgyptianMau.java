package net.mindview.chapter14.pets;

public class EgyptianMau extends Cat {
    public EgyptianMau() {
        super();
    }

    public EgyptianMau(String s) {
        super(s);
    }

    public static class Factory implements net.mindview.chapter14.pets.Factory<EgyptianMau> {

        @Override
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
}
