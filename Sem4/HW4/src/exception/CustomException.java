package exception;

public class CustomException extends Exception {
    private int firstArgument;
    private int secondArgument;

    public int getFirstArgument() {
        return firstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public CustomException(String message, int firstArgument, int secondArgument) {
        super(message);
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }
    public CustomException(String message){
        super(message);
    }
}
