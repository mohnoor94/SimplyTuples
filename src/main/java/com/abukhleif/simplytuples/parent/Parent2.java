package com.abukhleif.simplytuples.parent;

import com.abukhleif.simplytuples.tuple.Tuple1;
import com.abukhleif.simplytuples.type.SimplyTuple;

public interface Parent2<T1, T2> extends Parent1<T1> {

    Tuple1<T1> asTuple1();
    SimplyTuple remove2();
    SimplyTuple update2(T2 _2);

    default SimplyTuple removeSecond() {
        return remove2();
    }

    default SimplyTuple updateSecond(T2 second) {
        return update2(second);
    }
}
