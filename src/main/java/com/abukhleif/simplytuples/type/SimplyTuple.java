package com.abukhleif.simplytuples.type;


import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.tuple.Tuple0;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface SimplyTuple extends Serializable {

    SimplyTuple reverse();

    ExpandableTuple removeFirst();

    ExpandableTuple removeLast();

    List<Object> toList();

    <T> List<T> toList(Class<T> clazz);

    default Tuple0 clear() {
        return Tuple.empty();
    }

    default Set<Object> toSet() {
        return new HashSet<>(toList());
    }

    default <T> Set<T> toSet(Class<T> clazz) {
        return new HashSet<>(toList(clazz));
    }

    default Map<Integer, Object> toMap(int keysStart) {
        List<Object> list = toList();
        return Helper.toMap(keysStart, list);
    }

    default Map<Integer, Object> toMap() {
        List<Object> list = toList();
        return Helper.toMap(1, list);
    }

    default <T> Map<Integer, T> toMap(Class<T> clazz) {
        List<T> list = toList(clazz);
        return Helper.toMap(1, list);
    }

    default <T> Map<Integer, T> toMap(Class<T> clazz, int keysStart) {
        List<T> list = toList(clazz);
        return Helper.toMap(keysStart, list);
    }

    default <T> Map<T, Object> toMap(List<T> keys) {
        return Helper.toMap(keys, toList());
    }

    default <T, U> Map<T, U> toMap(Class<U> clazz, List<T> keys) {
        return Helper.toMap(keys, toList(clazz));
    }

    default Object[] toArray() {
        return toList().toArray(new Object[0]);
    }

    @SuppressWarnings("unchecked")
    default <T> T[] toArray(Class<T> clazz) {
        return toList(clazz).toArray((T[]) Array.newInstance(clazz, 0));
    }
}