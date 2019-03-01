package com.abukhleif.simplytuples.parent;

import com.abukhleif.simplytuples.tuple.Tuple3;
import com.abukhleif.simplytuples.type.SimplyTuple;

public interface Parent4<T1, T2, T3, T4> extends Parent3<T1, T2, T3> {

    Tuple3<T1, T2, T3> asTuple3();
    SimplyTuple remove4();
    SimplyTuple update4(T4 _4);

    default SimplyTuple removeFourth() {
        return remove4();
    }

    default SimplyTuple updateFourth(T4 fourth) {
        return update4(fourth);
    }
}
