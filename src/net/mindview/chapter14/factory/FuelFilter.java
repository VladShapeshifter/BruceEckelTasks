package net.mindview.chapter14.factory;

class FuelFilter extends Filter {
    public static class Factory implements net.mindview.chapter14.factory.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
