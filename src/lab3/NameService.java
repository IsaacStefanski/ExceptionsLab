package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws YourCustomExceptionName if fullName is null or empty or has
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalNameException {
        String lastName = null;
        
        if(fullName.isEmpty() || fullName == null || fullName.length() == 0 || !fullName.contains(" ")){
            throw new IllegalNameException("Sorry, you have entered an invalid full name");
        }
        String[] splitName = fullName.split("\\s+");
        lastName = splitName[1];
        
        return lastName;
    }    
}