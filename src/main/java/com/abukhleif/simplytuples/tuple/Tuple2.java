package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;

public class Tuple2<T1, T2> extends Tuple {

    public T1 _1;
    public T2 _2;

    public Tuple2(T1 _1, T2 _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public Tuple2 swap() {
        return reverse();
    }

    @Override
    public Tuple2<T2, T1> reverse() {
        return new Tuple2<>(_2, _1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ")";
    }
}