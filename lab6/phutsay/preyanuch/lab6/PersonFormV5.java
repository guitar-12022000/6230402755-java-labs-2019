/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 8/2/2020
 */
package phutsay.preyanuch.lab6;
import java.awt.*;
import javax.swing.*;

class PersonFormV5 extends PersonFormV4{
    
    protected Font labelFont = new Font("Serif", Font.PLAIN, 14);
    protected Font textFieldFont = new Font("Serif", Font.BOLD, 14);

    public PersonFormV5(String windowName) {
        super(windowName);
    }

    protected void setFonts() {
        labelName.setFont(labelFont);
        labelHeight.setFont(labelFont);
        labelWeight.setFont(labelFont);
        labelBirth.setFont(labelFont);
        labelSports.setFont(labelFont);
        labelNote.setFont(labelFont);
    }

    public void setColors() {
        cancelButton.setForeground(Color.RED);
        okButton.setForeground(Color.BLUE);
    }

    public void setValues() {
        textfieldName.setText("Manee");
        textfieldName.setFont(textFieldFont);

        heightTextField.setText("160");
        heightTextField.setFont(textFieldFont);

        weightTextField.setText("55");
        weightTextField.setFont(textFieldFont);

        birthTextField.setText("02-02-2000");
        birthTextField.setFont(textFieldFont);

        buttonStudent.setSelected(true);

        sportbox.setSelectedItem("Swimming");

        listHob.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        int[] select = {0, 3};
        listHob.setSelectedIndices(select);
    }

    protected void addMenus() {
		super.addMenus();	
    }
    protected void addComponents() {
        super.addComponents();
        setFonts();
        setColors();
        setValues();
    }
    
    protected static void createAndShowGUI() {
        PersonFormV5 personV5 = new PersonFormV5("Person Form V5");
		personV5.addComponents();
		personV5.addMenus();
		personV5.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}


