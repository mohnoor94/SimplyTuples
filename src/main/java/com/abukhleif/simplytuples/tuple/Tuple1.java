package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.parent.Parent1;
import com.abukhleif.simplytuples.type.ExpandableTuple;
import com.abukhleif.simplytuples.value.Value1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Tuple1<T1>
        implements ExpandableTuple, Parent1<T1>, Value1<T1> {

    private final T1 _1;

    public Tuple1(T1 _1) {
        this._1 = _1;
    }

    @Override
    public T1 _1() {
        return _1;
    }

    @Override
    public Tuple0 remove1() {
        return Tuple.empty();
    }

    @Override
    public Tuple1<T1> update1(T1 _1) {
        return Tuple.of(_1);
    }

    @Override
    public <T0> Tuple2<T0, T1> prepend(T0 _0) {
        return Tuple.of(_0, _1);
    }

    @Override
    public <T2> Tuple2<T1, T2> append(T2 _2) {
        return Tuple.of(_1, _2);
    }

    @Override
    public Tuple0 removeFirst() {
        return remove1();
    }

    @Override
    public Tuple0 removeLast() {
        return remove1();
    }

    @Override
    public Tuple1<T1> reverse() {
        return Tuple.of(_1);
    }


    @Override
    public List<Object> toList() {
        return Collections.singletonList(_1);
    }

    @Override
    public <T> List<T> toList(Class<T> clazz) {
        return Collections.singletonList(clazz.cast(_1));
    }

    @Override
    public String toString() {
        return "(" + _1 + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple1<?> tuple1 = (Tuple1<?>) o;
        return Objects.equals(_1, tuple1._1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_1);
    }
}