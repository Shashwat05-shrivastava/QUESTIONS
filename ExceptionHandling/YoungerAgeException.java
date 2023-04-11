package ExceptionHandling;

public class YoungerAgeException extends RuntimeException{
      YoungerAgeException(){
    	  super("Age  not valid");
      }
      YoungerAgeException(String message){
    	  super(message);
      }
}
