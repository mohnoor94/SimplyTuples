package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;

public class Tuple3<T1, T2, T3> extends Tuple {

    public T1 _1;
    public T2 _2;
    public T3 _3;

    public Tuple3(T1 _1, T2 _2, T3 _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    @Override
    public Tuple3<T3, T2, T1> reverse() {
        return new Tuple3<>(_3, _2, _1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ", " + _3 + ")";
    }
}