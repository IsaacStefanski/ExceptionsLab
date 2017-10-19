package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;
    private static String inputPrompt = "Enter full name:";

    public InputOutputGui() {
        nameService = new NameService();
    }

    public final void startConversation() {        
        String fullName = JOptionPane.showInputDialog(inputPrompt);
        String lastName = "";
        try{
            lastName = nameService.extractLastName(fullName);  
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public final static String getInputPrompt() {
        return inputPrompt;
    }

    public final static void setInputPrompt(String inputPrompt) {
        if(inputPrompt.isEmpty() || inputPrompt == null || inputPrompt.length() == 0){
            throw new IllegalArgumentException("Sorry, you have entered an invalid prompt");
        }
        InputOutputGui.inputPrompt = inputPrompt;
    }
}