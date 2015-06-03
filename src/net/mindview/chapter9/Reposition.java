package net.mindview.chapter9;

public class Reposition implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        char[] chars =  ((String)input).toCharArray();
        return null;
    }
}
