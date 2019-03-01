package com.abukhleif.simplytuples.value;

public interface Value5<T> {

    T _5();

    default T getValue5() {
        return _5();
    }

    default T fifth() {
        return _5();
    }

    default T getFifth() {
        return _5();
    }
}
