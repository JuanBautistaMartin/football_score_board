package exception;

public class GameValidationException extends RuntimeException {

  public GameValidationException(String errorMessage) {
    super(errorMessage);
  }

}
