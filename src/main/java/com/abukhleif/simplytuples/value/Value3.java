package com.abukhleif.simplytuples.value;

public interface Value3<T> {

    T _3();

    default T getValue3() {
        return _3();
    }

    default T third() {
        return _3();
    }

    default T getThird() {
        return _3();
    }
}
