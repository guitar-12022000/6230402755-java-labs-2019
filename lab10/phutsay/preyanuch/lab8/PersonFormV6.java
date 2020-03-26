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
    // OpenIcon
    protected URL icon = this.getClass().getResource("images/javaIcon.png");    
    protected JOptionPane infoPane;//for input string Info
    
    public PersonFormV6(String windowName) {
		super(windowName);
    }

    public void addListeners() { 
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
        buttonStudent.setActionCommand("Student");
        buttonTeacher.setActionCommand("Teacher");
    }

    //prepare information for handleOkButton
    protected String getInfo(){
        return "Name : " + textfieldName.getText() + "\n" + "Height (cm.) : " 
        + heightTextField.getText() + "\n"
        + "Weight (kg.) : " + weightTextField.getText() + "\n" 
        + "Date of birth (eg., 31-01-1990) : " 
        + birthTextField.getText() + "\n"
        + "Type : " + buttonStudent.getActionCommand() 
        + "\n" + "Sports : " + sportbox.getSelectedItem() + "\n"
        + "Hobbies : " + String.join(" ",listHob.getSelectedValuesList())  
        + "\n" + "Note : " + textNote.getText();
    }

    //event will occur when okButton is clicked
    protected void handleOkButton(){
        JOptionPane.showMessageDialog(this,getInfo(), "Person Information", 
        JOptionPane.INFORMATION_MESSAGE,new ImageIcon(icon));
    }

    public void actionPerformed(ActionEvent event) {
        Object clicked = event.getSource();
        infoPane = new JOptionPane(getInfo());//add string getInfo to infoPane
        if(clicked == okButton){
            handleOkButton();
        }
        else if(clicked == cancelButton){
            textfieldName.setText("");
            heightTextField.setText("");
            weightTextField.setText("");
            birthTextField.setText("");
            textNote.setText("");
        }    
    }
    
    protected static void createAndShowGUI() {
        PersonFormV6 personV6 = new PersonFormV6("Person Form V6");
        personV6.addMenus();
        personV6.addComponents();
        personV6.addListeners();
        personV6.setFrameFeatures();
    }  

    public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
        });
    }
}






