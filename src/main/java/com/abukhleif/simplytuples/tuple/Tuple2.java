package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.parent.Parent2;
import com.abukhleif.simplytuples.type.ExpandableTuple;
import com.abukhleif.simplytuples.value.Value1;
import com.abukhleif.simplytuples.value.Value2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tuple2<T1, T2>
        implements ExpandableTuple, Parent2<T1, T2>, Value1<T1>, Value2<T2> {

    private final T1 _1;
    private final T2 _2;

    public Tuple2(T1 _1, T2 _2) {
        this._1 = _1;
        this._2 = _2;
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
    public Tuple1<T1> asTuple1() {
        return remove2();
    }

    @Override
    public Tuple1<T2> remove1() {
        return Tuple.of(_2);
    }

    @Override
    public Tuple1<T1> remove2() {
        return Tuple.of(_1);
    }

    @Override
    public Tuple2<T1, T2> update1(T1 _1) {
        return Tuple.of(_1, _2);
    }

    @Override
    public Tuple2<T1, T2> update2(T2 _2) {
        return Tuple.of(_1, _2);
    }

    @Override
    public <T0> Tuple3<T0, T1, T2> prepend(T0 _3) {
        return Tuple.of(_3, _1, _2);
    }

    @Override
    public <T3> Tuple3<T1, T2, T3> append(T3 _3) {
        return Tuple.of(_1, _2, _3);
    }

    @Override
    public Tuple1<T2> removeFirst() {
        return remove1();
    }

    @Override
    public Tuple1<T1> removeLast() {
        return remove2();
    }

    public Tuple2<T2, T1> swap() {
        return reverse();
    }

    @Override
    public Tuple2<T2, T1> reverse() {
        return Tuple.of(_2, _1);
    }

    @Override
    public List<Object> toList() {
        return Arrays.asList(_1, _2);
    }

    @Override
    public <T> List<T> toList(Class<T> clazz) {
        return Arrays.asList(clazz.cast(_1), clazz.cast(_2));
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