/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 18/2/2020
 */
package phutsay.preyanuch.lab8;
import javax.swing.*;
import java.awt.event.*;

public class PersonFormV8 extends PersonFormV7{ 
    private static final long serialVersionUID = 1L;

    //title name.
    public PersonFormV8(String windowName) {
		super(windowName);	
    }
    
    //event when each sport is clicked.
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);

        Object typeObject = event.getSource();

        if (typeObject == sportbox) {
            JOptionPane.showMessageDialog(this,"Your Sport is now changd to " 
            + sportbox.getSelectedItem(), "Person Information", 
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
        } 
    }  

    //addListeners
    @Override
    public void addListeners() { 
        super.addListeners();
        sportbox.addActionListener(this);    
     }
    
    protected static void createAndShowGUI() {
        PersonFormV8 personV8 = new PersonFormV8("Person Form V8");
		personV8.addComponents();
        personV8.addMenus();
        personV8.addListeners();
		personV8.setFrameFeatures();
    }   

    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}   
}

