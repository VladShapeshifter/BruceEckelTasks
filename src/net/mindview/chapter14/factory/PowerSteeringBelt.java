package net.mindview.chapter14.factory;

class PowerSteeringBelt extends Belt {
    public static class Factory implements net.mindview.chapter14.factory.Factory<Belt> {

        @Override
        public Belt create() {
            return new PowerSteeringBelt();
        }
    }
}
