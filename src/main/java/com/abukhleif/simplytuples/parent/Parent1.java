package com.abukhleif.simplytuples.parent;

import com.abukhleif.simplytuples.type.SimplyTuple;

public interface Parent1<T1> extends Parent0 {

    SimplyTuple remove1();
    SimplyTuple update1(T1 _1);

    default SimplyTuple removeFirst() {
        return remove1();
    }

    default SimplyTuple updateFirst(T1 first) {
        return update1(first);
    }
}
