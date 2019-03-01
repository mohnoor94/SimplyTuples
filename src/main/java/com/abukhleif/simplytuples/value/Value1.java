package com.abukhleif.simplytuples.value;

public interface Value1<T> {

    T _1();

    default T getValue1() {
        return _1();
    }

    default T first() {
        return _1();
    }

    default T getFirst() {
        return _1();
    }
}
