package com.abukhleif.simplytuples.type;

public interface ExpandableTuple extends FixedTuple {

    <T> FixedTuple prepend(T t);
    <T> FixedTuple append(T t);
}
