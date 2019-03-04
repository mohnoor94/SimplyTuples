package com.abukhleif.simplytuples.type;

public interface ExpandableTuple extends SimplyTuple {

    <T> SimplyTuple prepend(T t);

    <T> SimplyTuple append(T t);
}
