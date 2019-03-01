package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomTests {

    @Test
    public void testUpdate() {
        Assert.assertEquals(Tuple.of(1, 2, 3, 4), Tuple.of(10, 2, 3, 4).update1(1));
    }

    @Test
    public void testUpdateNot() {
        Assert.assertNotEquals(Tuple.of(1, 2, 3, 4), Tuple.of(10, 2, 3, 4).update1(100));
    }

    @Test
    public void testMultipleUpdates() {
        Assert.assertEquals(Tuple.of(1, 2, 3, 4).update4(40), Tuple.of(10, 20, 30, 40).update1(1).update2(2).update3(3));
    }

    @Test
    public void testMultipleUpdatesNot() {
        Assert.assertNotEquals(Tuple.of(1, 2, 3, 4).update4(40), Tuple.of(10, 20, 30, 40).update1(1).update2(2));
    }

    @Test
    public void testRemove() {
        Assert.assertEquals(Tuple.of(5, 10, 15).remove2(), Tuple.of(5, 15));
    }

    @Test
    public void testRemoveNot() {
        Assert.assertNotEquals(Tuple.of(5, 10, 15).remove3(), Tuple.of(5, 15));
    }

    @Test
    public void testMultipleRemoves() {
        Assert.assertEquals(Tuple.of(5, 15, 20, 25).remove3(), Tuple.of(5, 10, 15, 25).remove2());
    }

    @Test
    public void testMultipleRemovesNot() {
        Assert.assertNotEquals(Tuple.of(5, 15, 20, 25).remove3(), Tuple.of(5, 10, 15, 25).remove3());
    }

    @Test
    public void testClear() {
        Assert.assertEquals(Tuple.of(10).clear(), Tuple.empty());
    }

    @Test
    public void testRemoveToEmpty() {
        Assert.assertEquals(Tuple.of(10).remove1(), Tuple.empty());
    }
}
