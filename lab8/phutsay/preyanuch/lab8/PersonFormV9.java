/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 24/2/2020
 */
package phutsay.preyanuch.lab8;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.*;


public class PersonFormV9 extends PersonFormV8 implements ActionListener{

    public PersonFormV9(String windowName) {
		super(windowName);	
    }
      
    @Override
    public void addListeners() { 
        super.addListeners();  
        listHob.addListSelectionListener(new ListSelectionListener(){
        
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {  // set message to show in dialog
                    JOptionPane.showMessageDialog(null, "Selected Hobbbies : " + String.join(" ", listHob.getSelectedValuesList())
                                                , "Person Information", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
                }
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
    }
    

    protected static void createAndShowGUI() {
        PersonFormV9 personV9 = new PersonFormV9("Person Form V9");
		personV9.addComponents();
        personV9.addMenus();
        personV9.addListeners();
		personV9.setFrameFeatures();
    }   
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}   
}

