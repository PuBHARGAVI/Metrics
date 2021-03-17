package metrics;

public class ZeroValueException extends Exception {
    ZeroValueException(String exceptionErrorMessage) {
        super(exceptionErrorMessage);
    }
}