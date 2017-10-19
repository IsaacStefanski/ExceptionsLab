package lab1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private int lastNameIndex = 1;
    private static String inputPrompt = "Enter full name (use Format: first last):";

    // this method responsible for output
    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog(inputPrompt);
        String lastName = "";
        try {
            lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception to the calling method and handle
    // it there.
    public final String extractLastName(String fullName) throws IllegalArgumentException {
        String lastName = null;
        
        if(fullName.isEmpty() || fullName == null || fullName.length() == 0){
            throw new IllegalArgumentException("Sorry, you have entered an invalid full name");
        }
        String[] splitName = fullName.split("\\s+");
        lastName = splitName[lastNameIndex];
        
        return lastName;
    }

    public final int getLastNameIndex() {
        return lastNameIndex;
    }

    public final void setLastNameIndex(int lastNameIndex) {
        if(lastNameIndex < 0){
            throw new IllegalArgumentException("Sorry, you have entered an invalid last name index");
        }
        this.lastNameIndex = lastNameIndex;
    }

    public final static String getInputPrompt() {
        return inputPrompt;
    }

    public final static void setInputPrompt(String inputPrompt) {
        if(inputPrompt.isEmpty() || inputPrompt == null || inputPrompt.length() == 0){
            throw new IllegalArgumentException("Sorry, you have entered an invalid prompt");
        }
        Challenge1.inputPrompt = inputPrompt;
    }    
}