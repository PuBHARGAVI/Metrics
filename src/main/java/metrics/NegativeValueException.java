package metrics;

public class NegativeValueException extends Exception {
    NegativeValueException(String exceptionErrorMessage) {
        super(exceptionErrorMessage);
    }
}