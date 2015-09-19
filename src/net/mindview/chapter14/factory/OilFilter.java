package net.mindview.chapter14.factory;

class OilFilter extends Filter {
    public static class Factory implements net.mindview.chapter14.factory.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
