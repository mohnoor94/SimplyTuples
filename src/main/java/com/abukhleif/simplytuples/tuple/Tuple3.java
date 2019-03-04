package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.parent.Parent3;
import com.abukhleif.simplytuples.type.ExpandableTuple;
import com.abukhleif.simplytuples.value.Value1;
import com.abukhleif.simplytuples.value.Value2;
import com.abukhleif.simplytuples.value.Value3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tuple3<T1, T2, T3>
        implements ExpandableTuple, Parent3<T1, T2, T3>, Value1<T1>, Value2<T2>, Value3<T3> {

    private final T1 _1;
    private final T2 _2;
    private final T3 _3;

    public Tuple3(T1 _1, T2 _2, T3 _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
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
    public Tuple1<T1> asTuple1() {
        return Tuple.of(_1);
    }

    @Override
    public Tuple2<T1, T2> asTuple2() {
        return remove3();
    }

    @Override
    public Tuple2<T2, T3> remove1() {
        return Tuple.of(_2, _3);
    }

    @Override
    public Tuple2<T1, T3> remove2() {
        return Tuple.of(_1, _3);
    }

    @Override
    public Tuple2<T1, T2> remove3() {
        return Tuple.of(_1, _2);
    }

    @Override
    public Tuple3<T1, T2, T3> update1(T1 _1) {
        return Tuple.of(_1, _2, _3);
    }

    @Override
    public Tuple3<T1, T2, T3> update2(T2 _2) {
        return Tuple.of(_1, _2, _3);
    }

    @Override
    public Tuple3<T1, T2, T3> update3(T3 _3) {
        return Tuple.of(_1, _2, _3);
    }

    @Override
    public <T0> Tuple4<T0, T1, T2, T3> prepend(T0 _0) {
        return Tuple.of(_0, _1, _2, _3);
    }

    @Override
    public <T4> Tuple4<T1, T2, T3, T4> append(T4 _4) {
        return Tuple.of(_1, _2, _3, _4);
    }

    @Override
    public Tuple2<T2, T3> removeFirst() {
        return remove1();
    }

    @Override
    public Tuple2<T1, T2> removeLast() {
        return remove3();
    }

    @Override
    public Tuple3<T3, T2, T1> reverse() {
        return Tuple.of(_3, _2, _1);
    }

    @Override
    public List<Object> toList() {
        return Arrays.asList(_1, _2, _3);
    }

    @Override
    public <T> List<T> toList(Class<T> clazz) {
        return Arrays.asList(clazz.cast(_1), clazz.cast(_2), clazz.cast(_3));
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ", " + _3 + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple3<?, ?, ?> tuple3 = (Tuple3<?, ?, ?>) o;
        return Objects.equals(_1, tuple3._1) &&
                Objects.equals(_2, tuple3._2) &&
                Objects.equals(_3, tuple3._3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1, _2, _3);
    }
}