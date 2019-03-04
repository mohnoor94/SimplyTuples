package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class ToSetTests {


    @Test
    public void testTuple4ToGenericSet() {
        Set<Object> set = Tuple.of('c', 10.5, "hello", 10.5).toSet();
        Assert.assertEquals(set.size(), 3);
        Assert.assertTrue(set.contains(10.5));
        Assert.assertTrue(set.contains('c'));
        Assert.assertTrue(set.contains("hello"));
        Assert.assertFalse(set.contains("hi"));
    }

    @Test
    public void testTuple3ToTypedSetNumbers() {
        Set<Number> numbers = Tuple.of(5, 10.5, 5).toSet(Number.class);
        Assert.assertEquals(numbers.size(), 2);
        Assert.assertTrue(numbers.contains(5));
        Assert.assertTrue(numbers.contains(10.5));
        Assert.assertFalse(numbers.contains(10));
    }

    @Test
    public void testTuple1ToTypedSetObject() {
        Set<String> stringSet = Tuple.of("hello").toSet(String.class);
        Assert.assertTrue(stringSet.contains("hello"));
    }

    @Test
    public void testTuple0ToSet() {
        Assert.assertEquals(Tuple.empty().toSet(), new HashSet<>());
    }

    @Test
    public void testTuple0ToSetObject() {
        Assert.assertEquals(Tuple.empty().toSet(String.class), new HashSet<>());
    }
}
