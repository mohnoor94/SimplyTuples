package com.abukhleif.simplytuples.error;

public class TupleTypeException extends SimplyTupleException {

    public TupleTypeException() {
        super();
    }

    public TupleTypeException(String message) {
        super(message);
    }

    public TupleTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TupleTypeException(Throwable cause) {
        super(cause);
    }

    protected TupleTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
