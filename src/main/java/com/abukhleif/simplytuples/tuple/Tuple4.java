package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;

public class Tuple4<T1, T2, T3, T4> extends Tuple {

    public T1 _1;
    public T2 _2;
    public T3 _3;
    public T4 _4;

    public Tuple4(T1 _1, T2 _2, T3 _3, T4 _4) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    @Override
    public Tuple4<T4, T3, T2, T1> reverse() {
        return new Tuple4<>(_4, _3, _2, _1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ")";
    }
}