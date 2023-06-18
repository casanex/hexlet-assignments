package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    public NegativeRadiusException(String message) {
        super(message);
    }
    public String getErrorDescription() {
        return this.getMessage();
    }
}
// END
