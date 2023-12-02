package exception;

public class CustomInsufficientFundsException extends CustomException{
    public CustomInsufficientFundsException(String message, int firstArgument, int secondArgument) {
        super(message, firstArgument, secondArgument);
    }
    public CustomInsufficientFundsException(String message){
        super(message);
    }
}
