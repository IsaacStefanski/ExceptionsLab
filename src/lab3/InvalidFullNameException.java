package lab3;

/**
 *
 * @author Isaac
 */
public class InvalidFullNameException extends IllegalArgumentException{
    private static String message = "Sorry, you have entered an invalid full name.";
    public InvalidFullNameException(){
        super(message);
    }
}