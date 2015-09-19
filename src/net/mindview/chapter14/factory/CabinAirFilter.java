package net.mindview.chapter14.factory;

class CabinAirFilter extends Filter {
    public static class Factory implements net.mindview.chapter14.factory.Factory<CabinAirFilter> {

        @Override
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
