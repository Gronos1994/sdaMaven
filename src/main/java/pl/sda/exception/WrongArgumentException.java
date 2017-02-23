package pl.sda.exception;

public class WrongArgumentException extends Exception {

    public WrongArgumentException(String message, Throwable e) {
        super(message, e);
    }

}
