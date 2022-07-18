package ru.javarush.cryptoanalyser.kochemazov.exceptions;
public class MainExceptionRun extends RuntimeException{
    public MainExceptionRun() {
    }
    public MainExceptionRun(String message) {
        super(message);
    }
    public MainExceptionRun(String message, Throwable cause) {
        super(message, cause);
    }
    public MainExceptionRun(Throwable cause) {
        super(cause);
    }
}
