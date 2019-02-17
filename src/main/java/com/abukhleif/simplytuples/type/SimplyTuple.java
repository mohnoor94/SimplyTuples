package com.abukhleif.simplytuples.type;

import com.abukhleif.simplytuples.builder.Tuple;

import java.io.Serializable;

public interface SimplyTuple extends Serializable {

    Tuple reverse();
}
