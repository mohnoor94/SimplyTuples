package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.parent.Parent5;
import com.abukhleif.simplytuples.type.SimplyTuple;
import com.abukhleif.simplytuples.value.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tuple5<T1, T2, T3, T4, T5>
        implements SimplyTuple, Parent5<T1, T2, T3, T4, T5>, Value1<T1>, Value2<T2>, Value3<T3>, Value4<T4>, Value5<T5> {

    private final T1 _1;
    private final T2 _2;
    private final T3 _3;
    private final T4 _4;
    private final T5 _5;

    public Tuple5(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
    }

    @Override
    public T1 _1() {
        return _1;
    }

    @Override
    public T2 _2() {
        return _2;
    }

    @Override
    public T3 _3() {
        return _3;
    }

    @Override
    public T4 _4() {
        return _4;
    }

    @Override
    public T5 _5() {
        return _5;
    }

    @Override
    public Tuple1<T1> asTuple1() {
        return Tuple.of(_1);
    }

    @Override
    public Tuple2<T1, T2> asTuple2() {
        return Tuple.of(_1, _2);
    }

    @Override
    public Tuple3<T1, T2, T3> asTuple3() {
        return Tuple.of(_1, _2, _3);
    }

    @Override
    public Tuple4<T1, T2, T3, T4> asTuple4() {
        return remove5();
    }

    @Override
    public Tuple4<T2, T3, T4, T5> remove1() {
        return Tuple.of(_2, _3, _4, _5);
    }

    @Override
    public Tuple4<T1, T3, T4, T5> remove2() {
        return Tuple.of(_1, _3, _4, _5);
    }

    @Override
    public Tuple4<T1, T2, T4, T5> remove3() {
        return Tuple.of(_1, _2, _4, _5);
    }

    @Override
    public Tuple4<T1, T2, T3, T5> remove4() {
        return Tuple.of(_1, _2, _3, _5);
    }

    @Override
    public Tuple4<T1, T2, T3, T4> remove5() {
        return Tuple.of(_1, _2, _3, _4);
    }

    @Override
    public Tuple5<T1, T2, T3, T4, T5> update1(T1 _1) {
        return Tuple.of(_1, _2, _3, _4, _5);
    }

    @Override
    public Tuple5<T1, T2, T3, T4, T5> update2(T2 _2) {
        return Tuple.of(_1, _2, _3, _4, _5);
    }

    @Override
    public Tuple5<T1, T2, T3, T4, T5> update3(T3 _3) {
        return Tuple.of(_1, _2, _3, _4, _5);
    }

    @Override
    public Tuple5<T1, T2, T3, T4, T5> update4(T4 _4) {
        return Tuple.of(_1, _2, _3, _4, _5);
    }

    @Override
    public Tuple5<T1, T2, T3, T4, T5> update5(T5 _5) {
        return Tuple.of(_1, _2, _3, _4, _5);
    }

    @Override
    public Tuple4<T2, T3, T4, T5> removeFirst() {
        return remove1();
    }

    @Override
    public Tuple4<T1, T2, T3, T4> removeLast() {
        return remove5();
    }

    @Override
    public Tuple5<T5, T4, T3, T2, T1> reverse() {
        return Tuple.of(_5, _4, _3, _2, _1);
    }

    @Override
    public List<Object> toList() {
        return Arrays.asList(_1, _2, _3, _4, _5);
    }

    @Override
    public <T> List<T> toList(Class<T> clazz) {
        return Arrays.asList(clazz.cast(_1), clazz.cast(_2), clazz.cast(_3), clazz.cast(_4), clazz.cast(_5));
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