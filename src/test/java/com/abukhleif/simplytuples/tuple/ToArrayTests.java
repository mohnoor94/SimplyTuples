package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToArrayTests {

    @Test
    public void testTuple2ToGenericArray() {
        Object[] array = Tuple.of(5, 10.5).toArray();
        Assert.assertEquals(array[0], 5);
        Assert.assertEquals(array[1], 10.5);
    }

    @Test
    public void testTuple4ToGenericArray() {
        Object[] array = Tuple.of('c', 10.5, "hello", false).toArray();
        Assert.assertEquals(array[0], 'c');
        Assert.assertEquals(array[1], 10.5);
        Assert.assertEquals(array[2], "hello");
        Assert.assertEquals(array[3], false);
    }

    @Test
    public void testTuple2ToTypedArrayNumbers() {
        Number[] numbers = Tuple.of(5, 10.5).toArray(Number.class);
        Assert.assertEquals(numbers[0], 5);
        Assert.assertEquals(numbers[1], 10.5);
    }

    @Test
    public void testTuple1ToTypedArrayObject() {
        Assert.assertEquals(Tuple.of("hello").toArray(String.class)[0], "hello");
    }

    @Test
    public void testTuple0ToArray() {
        Assert.assertEquals(Tuple.empty().toArray(), new Object[0]);
    }

    @Test
    public void testTuple0ToArrayObject() {
        Assert.assertEquals(Tuple.empty().toArray(String.class), new String[0]);
    }

}
