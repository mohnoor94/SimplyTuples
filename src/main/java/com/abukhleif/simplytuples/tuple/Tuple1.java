package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;

public class Tuple1<T1> extends Tuple {

    public T1 _1;

    public Tuple1(T1 _1) {
        this._1 = _1;
    }

    @Override
    public Tuple1<T1> reverse() {
        return new Tuple1<>(_1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ")";
    }
}