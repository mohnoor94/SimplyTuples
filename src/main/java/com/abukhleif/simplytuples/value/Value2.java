package com.abukhleif.simplytuples.value;

public interface Value2<T> {

    T _2();

    default T getValue2() {
        return _2();
    }

    default T second() {
        return _2();
    }

    default T getSecond() {
        return _2();
    }
}
