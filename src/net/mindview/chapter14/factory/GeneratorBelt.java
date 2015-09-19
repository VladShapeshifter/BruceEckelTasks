package net.mindview.chapter14.factory;

class GeneratorBelt extends Belt {
    public static class Factory implements net.mindview.chapter14.factory.Factory<GeneratorBelt> {

        @Override
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
