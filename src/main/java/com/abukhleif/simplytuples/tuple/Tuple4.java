package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.type.ExpandableTuple;

import java.util.Objects;

public class Tuple4<T1, T2, T3, T4> implements ExpandableTuple {

    private T1 _1;
    private T2 _2;
    private T3 _3;
    private T4 _4;

    public Tuple4(T1 _1, T2 _2, T3 _3, T4 _4) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    public T1 _1() {
        return _1;
    }

    public T2 _2() {
        return _2;
    }

    public T3 _3() {
        return _3;
    }

    public T4 _4() {
        return _4;
    }

    public Tuple1<T1> asTuple1() {
        return Tuple.of(_1);
    }

    public Tuple2<T1, T2> asTuple2() {
        return Tuple.of(_1, _2);
    }

    public Tuple3<T1, T2, T3> asTuple3() {
        return Tuple.of(_1, _2, _3);
    }

    @Override
    public <T0> Tuple5<T0, T1, T2, T3, T4> prepend(T0 _0) {
        return Tuple.of(_0, _1, _2, _3, _4);
    }

    @Override
    public <T5> Tuple5<T1, T2, T3, T4, T5> append(T5 _5) {
        return Tuple.of(_1, _2, _3, _4, _5);
    }

    @Override
    public Tuple4<T4, T3, T2, T1> reverse() {
        return Tuple.of(_4, _3, _2, _1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple4<?, ?, ?, ?> tuple4 = (Tuple4<?, ?, ?, ?>) o;
        return Objects.equals(_1, tuple4._1) &&
                Objects.equals(_2, tuple4._2) &&
                Objects.equals(_3, tuple4._3) &&
                Objects.equals(_4, tuple4._4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2, _3, _4);
    }
}