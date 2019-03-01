package com.abukhleif.simplytuples.value;

public interface Value4<T> {

    T _4();

    default T getValue4() {
        return _4();
    }

    default T fourth() {
        return _4();
    }

    default T getFourth() {
        return _4();
    }
}
