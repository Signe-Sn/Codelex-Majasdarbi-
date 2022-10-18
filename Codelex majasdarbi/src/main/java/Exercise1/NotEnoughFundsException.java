package Exercise1;

public class NotEnoughFundsException extends RuntimeException{
    public NotEnoughFundsException(String errorMessage){
        super(errorMessage);
    }
}
