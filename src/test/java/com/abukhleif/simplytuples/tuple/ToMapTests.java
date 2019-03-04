package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToMapTests {

    @Test
    public void testTuple2ToGenericMap() {
        Map<Integer, Object> map = Tuple.of(5, 10.5).toMap();
        Assert.assertEquals(map.get(1), 5);
        Assert.assertEquals(map.get(2), 10.5);
    }

    @Test
    public void testTuple2ToGenericMapWithKeys() {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("first");
        keys.add("second");
        Map<String, Object> map = Tuple.of(5, 10.5).toMap(keys);
        Assert.assertEquals(map.get("first"), 5);
        Assert.assertEquals(map.get("second"), 10.5);
        Assert.assertNotEquals(map.get("third"), 10.5);
    }

    @Test
    public void testTuple4ToGenericMap() {
        Map<Integer, Object> map = Tuple.of('c', 10.5, "hello", false).toMap();
        Assert.assertEquals(map.get(1), 'c');
        Assert.assertEquals(map.get(2), 10.5);
        Assert.assertEquals(map.get(3), "hello");
        Assert.assertEquals(map.get(4), false);
    }

    @Test
    public void testTuple4ToGenericMapCustomStart() {
        Map<Integer, Object> map = Tuple.of('c', 10.5, "hello", false).toMap(10);
        Assert.assertEquals(map.get(10), 'c');
        Assert.assertEquals(map.get(11), 10.5);
        Assert.assertEquals(map.get(12), "hello");
        Assert.assertEquals(map.get(13), false);
    }

    @Test
    public void testTuple4ToGenericMapWithKeys() {
        ArrayList<Character> keys = new ArrayList<>();
        keys.add('a');
        keys.add('b');
        keys.add('c');
        keys.add('d');
        Map<Character, Object> map = Tuple.of('c', 10.5, "hello", false).toMap(keys);
        Assert.assertEquals(map.get('a'), 'c');
        Assert.assertEquals(map.get('b'), 10.5);
        Assert.assertEquals(map.get('c'), "hello");
        Assert.assertEquals(map.get('d'), false);
        Assert.assertNull(map.get('e'));
    }

    @Test
    public void testTuple2ToTypedMapNumbers() {
        Map<Integer, Number> numbers = Tuple.of(5, 10.5).toMap(Number.class);
        Assert.assertEquals(numbers.get(1), 5);
        Assert.assertEquals(numbers.get(2), 10.5);
    }

    @Test
    public void testTuple2ToTypedMapNumbersCustomStart() {
        Map<Integer, Number> numbers = Tuple.of(5, 10.5).toMap(Number.class, 0);
        Assert.assertEquals(numbers.get(0), 5);
        Assert.assertEquals(numbers.get(1), 10.5);
    }

    @Test
    public void testTuple2ToTypedMapNumbersWithKeys() {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("first");
        keys.add("second");
        Map<String, Number> numbers = Tuple.of(5, 10.5).toMap(Number.class, keys);
        Assert.assertEquals(numbers.get("first"), 5);
        Assert.assertEquals(numbers.get("second"), 10.5);
        Assert.assertNull(numbers.get("nothing"));
    }

    @Test(
            expectedExceptions = AssertionError.class,
            expectedExceptionsMessageRegExp = "keys must be of the same size of the tuple"
    )
    public void testTuple2ToTypedMapNumbersWithKeysDifferentSize() {
        ArrayList<String> keys = new ArrayList<>();
        keys.add("first");
        keys.add("second");
        keys.add("third");
        Map<String, Number> numbers = Tuple.of(5, 10.5).toMap(Number.class, keys);
        Assert.assertEquals(numbers.get("first"), 5);
        Assert.assertEquals(numbers.get("second"), 10.5);
        Assert.assertNull(numbers.get("nothing"));
    }

    @Test
    public void testTuple1ToTypedMapObject() {
        Assert.assertEquals(Tuple.of("hello").toMap(String.class).get(1), "hello");
    }

    @Test
    public void testTuple0ToMap() {
        Assert.assertEquals(Tuple.empty().toMap(), new HashMap<>());
    }

    @Test
    public void testTuple0ToMapObject() {
        Assert.assertEquals(Tuple.empty().toMap(String.class), new HashMap<Integer, String>());
    }
}
