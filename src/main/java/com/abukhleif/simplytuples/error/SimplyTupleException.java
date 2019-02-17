package com.abukhleif.simplytuples.error;

public class SimplyTupleException extends RuntimeException{

    public SimplyTupleException() {
        super();
    }

    public SimplyTupleException(String message) {
        super(message);
    }

    public SimplyTupleException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimplyTupleException(Throwable cause) {
        super(cause);
    }

    protected SimplyTupleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
