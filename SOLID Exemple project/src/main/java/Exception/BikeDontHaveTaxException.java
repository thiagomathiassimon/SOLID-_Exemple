package Exception;

public class BikeDontHaveTaxException extends RuntimeException{
   public BikeDontHaveTaxException(String message){
        super(message);
    }
}
