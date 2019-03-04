package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ToListTests {

    @Test
    public void testTuple2ToGenericList() {
        List<Object> list = Tuple.of(5, 10.5).toList();
        Assert.assertEquals(list.get(0), 5);
        Assert.assertEquals(list.get(1), 10.5);
    }

    @Test
    public void testTuple4ToGenericList() {
        List<Object> list = Tuple.of('c', 10.5, "hello", false).toList();
        Assert.assertEquals(list.get(0), 'c');
        Assert.assertEquals(list.get(1), 10.5);
        Assert.assertEquals(list.get(2), "hello");
        Assert.assertEquals(list.get(3), false);
    }

    @Test
    public void testTuple2ToTypedListNumbers() {
        List<Number> numbers = Tuple.of(5, 10.5).toList(Number.class);
        Assert.assertEquals(numbers.get(0), 5);
        Assert.assertEquals(numbers.get(1), 10.5);
    }

    @Test
    public void testTuple1ToTypedListObject() {
        Assert.assertEquals(Tuple.of("hello").toList(String.class).get(0), "hello");
    }

    @Test
    public void testTuple2ToTypedListObject() {
        List<Animal> animals = Tuple.of(new Cat(), new Dog()).toList(Animal.class);
        Assert.assertEquals(animals.get(0), new Cat());
        Assert.assertEquals(animals.get(1), new Dog());
    }

    @Test
    public void testTuple3ToTypedListObject() {
        List<Animal> animals = Tuple.of(new Cat(), new Dog(), new Animal()).toList(Animal.class);
        Assert.assertEquals(animals.get(0), new Cat());
        Assert.assertEquals(animals.get(1), new Dog());
        Assert.assertEquals(animals.get(2), new Animal());
    }

    @Test
    public void testTuple2ToTypedListObjectNot() {
        List<Animal> animals = Tuple.of(new Cat(), new Dog()).toList(Animal.class);
        Assert.assertEquals(animals.get(0), new Cat());
        Assert.assertNotEquals(animals.get(1), new Cat());
    }

    @Test
    public void testTuple0ToList() {
        Assert.assertEquals(Tuple.empty().toList(), new ArrayList());
    }

    @Test
    public void testTuple0ToListObject() {
        Assert.assertEquals(Tuple.empty().toList(String.class), new ArrayList());
    }

    class Animal {
        @Override
        public boolean equals(Object obj) {
            return obj instanceof Animal;
        }
    }

    class Cat extends Animal {
        @Override
        public boolean equals(Object obj) {
            return obj instanceof Cat;
        }
    }

    class Dog extends Animal {
        @Override
        public boolean equals(Object obj) {
            return obj instanceof Dog;
        }
    }
}
