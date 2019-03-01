package com.abukhleif.simplytuples.type;


import com.abukhleif.simplytuples.builder.Tuple;
import com.abukhleif.simplytuples.tuple.Tuple0;

import java.io.Serializable;

public interface SimplyTuple extends Serializable {

    SimplyTuple reverse();
    ExpandableTuple removeFirst();
    ExpandableTuple removeLast();

    default Tuple0 clear() {
        return Tuple.empty();
    }
}
