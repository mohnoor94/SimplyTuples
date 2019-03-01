package com.abukhleif.simplytuples.parent;

import com.abukhleif.simplytuples.tuple.Tuple4;
import com.abukhleif.simplytuples.type.SimplyTuple;

public interface Parent5<T1, T2, T3, T4, T5> extends Parent4<T1, T2, T3, T4> {

    Tuple4<T1, T2, T3, T4> asTuple4();
    SimplyTuple remove5();
    SimplyTuple update5(T5 _5);

    default SimplyTuple removeFifth() {
        return remove5();
    }

    default SimplyTuple updateFifth(T5 fifth) {
        return update5(fifth);
    }
}
