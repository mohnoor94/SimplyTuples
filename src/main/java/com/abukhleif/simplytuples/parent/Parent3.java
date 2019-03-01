package com.abukhleif.simplytuples.parent;

import com.abukhleif.simplytuples.tuple.Tuple2;
import com.abukhleif.simplytuples.type.SimplyTuple;

public interface Parent3<T1, T2, T3> extends Parent2<T1, T2> {

    Tuple2<T1, T2> asTuple2();
    SimplyTuple remove3();
    SimplyTuple update3(T3 _3);

    default SimplyTuple removeThird() {
        return remove3();
    }

    default SimplyTuple updateThird(T3 third) {
        return update3(third);
    }
}
