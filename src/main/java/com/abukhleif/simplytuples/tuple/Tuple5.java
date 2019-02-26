package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.type.FixedTuple;

import java.util.Objects;

public class Tuple5<T1, T2, T3, T4, T5> implements FixedTuple {

    private T1 _1;
    private T2 _2;
    private T3 _3;
    private T4 _4;
    private T5 _5;

    public Tuple5(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
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

    public T5 _5() {
        return _5;
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

    public Tuple4<T1, T2, T3, T4> asTuple4() {
        return Tuple.of(_1, _2, _3, _4);
    }

    @Override
    public Tuple4<T2, T3, T4, T5> removeFirst() {
        return Tuple.of(_2, _3, _4, _5);
    }

    @Override
    public Tuple4<T1, T2, T3, T4> removeLast() {
        return Tuple.of(_1, _2, _3, _4);
    }

    @Override
    public Tuple5<T5, T4, T3, T2, T1> reverse() {
        return Tuple.of(_5, _4, _3, _2, _1);
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple5<?, ?, ?, ?, ?> tuple5 = (Tuple5<?, ?, ?, ?, ?>) o;
        return Objects.equals(_1, tuple5._1) &&
                Objects.equals(_2, tuple5._2) &&
                Objects.equals(_3, tuple5._3) &&
                Objects.equals(_4, tuple5._4) &&
                Objects.equals(_5, tuple5._5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2, _3, _4, _5);
    }
}