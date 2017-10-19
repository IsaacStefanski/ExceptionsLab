package lab3;

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
        try{
            String lastName = nameService.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch(IllegalNameException ine){
            JOptionPane.showMessageDialog(null, ine.getMessage());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }       
    }
}