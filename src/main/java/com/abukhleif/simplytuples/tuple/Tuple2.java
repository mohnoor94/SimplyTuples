package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.type.ExpandableTuple;

import java.util.Objects;

public class Tuple2<T1, T2> implements ExpandableTuple {

    private T1 _1;
    private T2 _2;

    public Tuple2(T1 _1, T2 _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public T1 _1() {
        return _1;
    }

    public T2 _2() {
        return _2;
    }

    public Tuple1<T1> asTuple1() {
        return Tuple.of(_1);
    }

    @Override
    public <T0> Tuple3<T0, T1, T2> prepend(T0 _3) {
        return Tuple.of(_3, _1, _2);
    }

    @Override
    public <T3> Tuple3<T1, T2, T3> append(T3 _3) {
        return Tuple.of(_1, _2, _3);
    }

    public Tuple2 swap() {
        return reverse();
    }

    @Override
    public Tuple2<T2, T1> reverse() {
        return Tuple.of(_2, _1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple2<?, ?> tuple2 = (Tuple2<?, ?>) o;
        return Objects.equals(_1, tuple2._1) &&
                Objects.equals(_2, tuple2._2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2);
    }
}