package net.mindview.chapter15.characters;

import net.mindview.chapter14.coffee.Generator;

import java.util.Iterator;
import java.util.Random;

public class StoryCharacters implements Generator<Character>, Iterable<Character> {
    private Class[] guys = {MasterJoda.class, Chewbacca.class, LukeSkywalker.class, HanSolo.class, PrincessLeia.class,
            DarthSidious.class, DarthVader.class, JabaFat.class, GeneralGrievous.class};
    private static Random rand = new Random();
    public StoryCharacters() {};

    private int size = 0;
    public StoryCharacters(int cz) {
        size = cz;
    }
    @Override
    public Character next() {
        try {
            return (Character) guys[rand.nextInt(guys.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CharacterIterator implements Iterator<Character> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Character next() {
            count--;
            return StoryCharacters.this.next();
        }

    }
    @Override
    public Iterator<Character> iterator() {
        return new CharacterIterator();
    }

    public static void main(String[] args) {
        StoryCharacters starWars = new StoryCharacters();
        for (int i = 0; i < 5; i++)
            System.out.println(starWars.next());

        for (Character someGuy : new StoryCharacters(5)) {
            System.out.println(someGuy);
        }
    }
}
