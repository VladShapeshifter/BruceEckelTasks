package net.mindview.chapter14.factory;

class AirFilter extends Filter {
    public static class Factory implements net.mindview.chapter14.factory.Factory<AirFilter> {

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
