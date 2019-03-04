package com.abukhleif.simplytuples.tuple;

import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.parent.Parent0;
import com.abukhleif.simplytuples.type.ExpandableTuple;

import java.util.Collections;
import java.util.List;

public class Tuple0 implements ExpandableTuple, Parent0 {

    private static final Tuple0 instance = new Tuple0();

    private Tuple0() {
    }

    public static Tuple0 get() {
        return instance;
    }

    @Override
    public <T0> Tuple1<T0> prepend(T0 _0) {
        return Tuple.of(_0);
    }

    @Override
    public <T1> Tuple1<T1> append(T1 _1) {
        return Tuple.of(_1);
    }

    @Override
    public Tuple0 removeFirst() {
        return Tuple.empty();
    }

    @Override
    public Tuple0 removeLast() {
        return Tuple.empty();
    }

    @Override
    public Tuple0 reverse() {
        return Tuple.empty();
    }


    @Override
    public List<Object> toList() {
        return Collections.emptyList();
    }

    @Override
    public <T> List<T> toList(Class<T> clazz) {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        return "()";
    }
}