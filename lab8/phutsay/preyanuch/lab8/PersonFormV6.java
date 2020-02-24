/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 17/2/2020
 */
package phutsay.preyanuch.lab8;
import phutsay.preyanuch.lab6.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;

public class PersonFormV6 extends PersonFormV5 implements ActionListener{
    
    
        
    private static final long serialVersionUID = 1L;
    protected URL icon = this.getClass().getResource("images/javaIcon.png");// OpenIcon

        
    public PersonFormV6(String windowName) {
		super(windowName);
    }
    


    public void actionPerformed(ActionEvent event) {

        Object srcObj = event.getSource();
        if (srcObj == okButton) {
            JOptionPane.showMessageDialog(this ,"Name : " + textfieldName.getText() + "\n" + "Height (cm) : " + heightTextField.getText()
            + "\n" + "Weight (kg) : " + weightTextField.getText() + "\n" + "Date of Birth : " +
             birthTextField.getText() + "\n" + "Type : " + buttonStudent.getActionCommand() + "\n" + "Sports : " + sportbox.getSelectedItem() + "\n" + "Hobbies :"
            + String.join(" ",listHob.getSelectedValuesList()) + "\n" + "Note : " + 
            textNote.getText(), "Person Information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
            }
        
        else if (srcObj == cancelButton) {
            
            textfieldName.setText(""); 
            heightTextField.setText("");
            weightTextField.setText("");
            birthTextField.setText("");
            textNote.setText("");
        }
    }

    public void addListeners() { 
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }
    
	protected static void createAndShowGUI() {
        PersonFormV6 personV6 = new PersonFormV6("Person Form V6");
		personV6.addComponents();
        personV6.addMenus();
        personV6.addListeners();
		personV6.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}   
}






