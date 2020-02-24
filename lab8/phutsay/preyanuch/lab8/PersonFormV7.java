/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 17/2/2020
 */
package phutsay.preyanuch.lab8;
import javax.swing.*;
import java.awt.event.*;


public class PersonFormV7 extends PersonFormV6 implements ActionListener{

    public PersonFormV7(String windowName) {
        super(windowName);  
    }
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object typeObject = event.getSource();

        if (typeObject == buttonStudent) {
            JOptionPane.showMessageDialog(this ,"Type : student has been selected", "Person Information", 
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
            }
        else if (typeObject == buttonTeacher) {
            
            JOptionPane.showMessageDialog(this ,"Type : teacher has been selected", "Person Information", 
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
        }
    }

    public void addListeners() { 
        super.addListeners();
        buttonStudent.addActionListener(this);
        buttonTeacher.addActionListener(this);
    }

    protected static void createAndShowGUI() {
        PersonFormV7 personV7 = new PersonFormV7("Person Form V7");
		personV7.addComponents();
        personV7.addMenus();
        personV7.addListeners();
		personV7.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}   
}



