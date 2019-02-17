package com.abukhleif.simplytuples.builder;

import com.abukhleif.simplytuples.error.FieldNotFoundException;
import com.abukhleif.simplytuples.error.TupleTypeException;
import com.abukhleif.simplytuples.tuple.*;
import com.abukhleif.simplytuples.type.SimplyTuple;

public abstract class Tuple<T1, T2, T3, T4, T5> implements SimplyTuple {

    public static <T1> Tuple1<T1> of(T1 _1) {
        return new Tuple1<>(_1);
    }

    public static <T1, T2> Tuple2<T1, T2> of(T1 _1, T2 _2) {
        return new Tuple2<>(_1, _2);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> of(T1 _1, T2 _2, T3 _3) {
        return new Tuple3<>(_1, _2, _3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(T1 _1, T2 _2, T3 _3, T4 _4) {
        return new Tuple4<>(_1, _2, _3, _4);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        return new Tuple5<>(_1, _2, _3, _4, _5);
    }

    public T1 _1() {
        if (this instanceof Tuple1) return toTuple1()._1;
        if (this instanceof Tuple2) return toTuple2()._1;
        if (this instanceof Tuple3) return toTuple3()._1;
        if (this instanceof Tuple4) return toTuple4()._1;
        if (this instanceof Tuple5) return toTuple5()._1;
        throw new FieldNotFoundException(String.format("Field _1 cannot be found in %s", this));
    }

    public T2 _2() {
        if (this instanceof Tuple2) return toTuple2()._2;
        if (this instanceof Tuple3) return toTuple3()._2;
        if (this instanceof Tuple4) return toTuple4()._2;
        if (this instanceof Tuple5) return toTuple5()._2;
        throw new FieldNotFoundException(String.format("Field _2 cannot be found in %s", this));
    }

    public T3 _3() {
        if (this instanceof Tuple3) return toTuple3()._3;
        if (this instanceof Tuple4) return toTuple4()._3;
        if (this instanceof Tuple5) return toTuple5()._3;
        throw new FieldNotFoundException(String.format("Field _3 cannot be found in %s", this));
    }

    public T4 _4() {
        if (this instanceof Tuple4) return toTuple4()._4;
        if (this instanceof Tuple5) return toTuple5()._4;
        throw new FieldNotFoundException(String.format("Field _4 cannot be found in %s", this));
    }

    public T5 _5() {
        if (this instanceof Tuple5) return toTuple5()._5;
        throw new FieldNotFoundException(String.format("Field _5 cannot be found in %s", this));
    }

    public Tuple1<T1> asTuple1() {
        if (this instanceof Tuple1) return toTuple1();
        if (this instanceof Tuple2) return new Tuple1<>(toTuple2()._1);
        if (this instanceof Tuple3) return new Tuple1<>(toTuple3()._1);
        if (this instanceof Tuple4) return new Tuple1<>(toTuple4()._1);
        if (this instanceof Tuple5) return new Tuple1<>(toTuple5()._1);
        throw new TupleTypeException(String.format("Cannot cast %s to Tuple1", this));
    }

    public Tuple2<T1, T2> asTuple2() {
        if (this instanceof Tuple1) {
            return new Tuple2<>(toTuple1()._1, null);
        }
        if (this instanceof Tuple2) {
            return toTuple2();
        }
        if (this instanceof Tuple3) {
            Tuple3<T1, T2, T3> t3 = toTuple3();
            return new Tuple2<>(t3._1, t3._2);
        }
        if (this instanceof Tuple4) {
            Tuple4<T1, T2, T3, T4> t4 = toTuple4();
            return new Tuple2<>(t4._1, t4._2);
        }
        if (this instanceof Tuple5) {
            Tuple5<T1, T2, T3, T4, T5> t5 = toTuple5();
            return new Tuple2<>(t5._1, t5._2);
        }
        throw new TupleTypeException(String.format("Cannot cast %s to Tuple2", this));
    }

    public Tuple3<T1, T2, T3> asTuple3() {
        if (this instanceof Tuple1) {
            return new Tuple3<>(toTuple1()._1, null, null);
        }
        if (this instanceof Tuple2) {
            Tuple2<T1, T2> t2 = toTuple2();
            return new Tuple3<>(t2._1, t2._2, null);
        }
        if (this instanceof Tuple3) {
            return toTuple3();
        }
        if (this instanceof Tuple4) {
            Tuple4<T1, T2, T3, T4> t4 = toTuple4();
            return new Tuple3<>(t4._1, t4._2, t4._3);
        }
        if (this instanceof Tuple5) {
            Tuple5<T1, T2, T3, T4, T5> t5 = toTuple5();
            return new Tuple3<>(t5._1, t5._2, t5._3);
        }
        throw new TupleTypeException(String.format("Cannot cast %s to Tuple3", this));
    }

    public Tuple4<T1, T2, T3, T4> asTuple4() {
        if (this instanceof Tuple1) {
            return new Tuple4<>(toTuple1()._1, null, null, null);
        }
        if (this instanceof Tuple2) {
            Tuple2<T1, T2> t2 = toTuple2();
            return new Tuple4<>(t2._1, t2._2, null, null);
        }
        if (this instanceof Tuple3) {
            Tuple3<T1, T2, T3> t3 = toTuple3();
            return new Tuple4<>(t3._1, t3._2, t3._3, null);
        }
        if (this instanceof Tuple4) {
            return toTuple4();
        }
        if (this instanceof Tuple5) {
            Tuple5<T1, T2, T3, T4, T5> t5 = toTuple5();
            return new Tuple4<>(t5._1, t5._2, t5._3, t5._4);
        }
        throw new TupleTypeException(String.format("Cannot cast %s to Tuple4", this));
    }

    public Tuple5<T1, T2, T3, T4, T5> asTuple5() {
        if (this instanceof Tuple1) {
            return new Tuple5<>(toTuple1()._1, null, null, null, null);
        }
        if (this instanceof Tuple2) {
            Tuple2<T1, T2> t2 = toTuple2();
            return new Tuple5<>(t2._1, t2._2, null, null, null);
        }
        if (this instanceof Tuple3) {
            Tuple3<T1, T2, T3> t3 = toTuple3();
            return new Tuple5<>(t3._1, t3._2, t3._3, null, null);
        }
        if (this instanceof Tuple4) {
            Tuple4<T1, T2, T3, T4> t4 = toTuple4();
            return new Tuple5<>(t4._1, t4._2, t4._3, t4._4, null);
        }
        if (this instanceof Tuple5) {
            return toTuple5();
        }
        throw new TupleTypeException(String.format("Cannot cast %s to Tuple5", this));
    }

    private Tuple1<T1> toTuple1() {
        return (Tuple1<T1>) this;
    }

    private Tuple2<T1, T2> toTuple2() {
        return (Tuple2<T1, T2>) this;
    }

    private Tuple3<T1, T2, T3> toTuple3() {
        return (Tuple3<T1, T2, T3>) this;
    }

    private Tuple4<T1, T2, T3, T4> toTuple4() {
        return (Tuple4<T1, T2, T3, T4>) this;
    }

    private Tuple5<T1, T2, T3, T4, T5> toTuple5() {
        return (Tuple5<T1, T2, T3, T4, T5>) this;
    }
}