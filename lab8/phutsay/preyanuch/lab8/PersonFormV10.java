/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 24/2/2020
 */
package phutsay.preyanuch.lab8;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class PersonFormV10 extends PersonFormV9 implements ActionListener{

    Font size16 = new Font("Serif", Font.BOLD, 16);
    Font size20 = new Font("Serif", Font.BOLD, 20);
    Font size24 = new Font("Serif", Font.BOLD, 24);

    public PersonFormV10(String windowName) {
		super(windowName);	
    }

    public void addListeners() {
        super.addListeners();
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        sixteenth.addActionListener(this);
        twenty.addActionListener(this);
        twentyfour.addActionListener(this);
    }

    public void setMAkeys(JMenuItem item, char mKey, int aKey) { 
        item.setMnemonic(mKey);
        item.setAccelerator(KeyStroke.getKeyStroke(aKey, ActionEvent.CTRL_MASK));
    }
        
    public void addKeys() {
        config.setMnemonic(KeyEvent.VK_C);
        color.setMnemonic(KeyEvent.VK_L);
        size.setMnemonic(KeyEvent.VK_Z);

        setMAkeys(red, 'R', KeyEvent.VK_R);
        setMAkeys(green, 'G', KeyEvent.VK_G);
        setMAkeys(blue, 'B', KeyEvent.VK_B);
        setMAkeys(sixteenth, '1', KeyEvent.VK_1);
        setMAkeys(twenty, '0', KeyEvent.VK_0);
        setMAkeys(twentyfour, '4', KeyEvent.VK_4);
    }

    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object obj = event.getSource();
        // set color if user click
        if (obj == red) {
            textfieldName.setForeground(Color.RED);
            heightTextField.setForeground(Color.RED);
            weightTextField.setForeground(Color.RED);
            birthTextField.setForeground(Color.RED);
            textNote.setForeground(Color.RED);
        } else if (obj == green) {
            textfieldName.setForeground(Color.GREEN);
            heightTextField.setForeground(Color.GREEN);
            weightTextField.setForeground(Color.GREEN);
            birthTextField.setForeground(Color.GREEN);
            textNote.setForeground(Color.GREEN);
        } else if (obj == blue) {
            textfieldName.setForeground(Color.BLUE);
            heightTextField.setForeground(Color.BLUE);
            weightTextField.setForeground(Color.BLUE);
            birthTextField.setForeground(Color.BLUE);
            textNote.setForeground(Color.BLUE);
        }
        // set font if size number is clicked
        if (obj == sixteenth) {
            textfieldName.setFont(size16);
            weightTextField.setFont(size16);
            heightTextField.setFont(size16);
            birthTextField.setFont(size16);
            textNote.setFont(size16);
        } else if (obj == twenty) {
            textfieldName.setFont(size20);
            heightTextField.setFont(size20);
            weightTextField.setFont(size20);
            birthTextField.setFont(size20);
            textNote.setFont(size20);
        } else if (obj == twentyfour) {
            textfieldName.setFont(size24);
            heightTextField.setFont(size24);
            weightTextField.setFont(size24);
            birthTextField.setFont(size24);
            textNote.setFont(size24);
        }
    }
    
    protected static void createAndShowGUI() {
        PersonFormV10 personV10 = new PersonFormV10("Person Form V10");
        personV10.addKeys();
		personV10.addComponents();
        personV10.addMenus();
        personV10.addListeners();
		personV10.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}   
}

