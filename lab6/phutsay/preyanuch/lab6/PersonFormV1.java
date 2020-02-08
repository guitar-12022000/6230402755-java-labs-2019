/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 20/1/2020
 */
package phutsay.preyanuch.lab6;
import javax.swing.*;
import java.awt.*;


class PersonFormV1 extends MySimpleWindow{

    protected JPanel panelAll = new JPanel();


    // protected JPanel panelButton = new JPanel();

    // protected JPanel panelButton = new JPanel();
    
    protected JLabel labelName = new JLabel("Name:");
    protected JTextField textfieldName = new JTextField(15);

    protected JLabel labelHeight = new JLabel("Height (cm.):");
    protected JTextField heightTextField = new JTextField(15);

    protected JLabel labelWeight = new JLabel("Weight (kg.):");
    protected JTextField weightTextField = new JTextField(15);

    protected JLabel labelBirth = new JLabel("Date of birth (eg., 31-01-1990):");
    protected JTextField birthTextField = new JTextField(15);

    //labelType:
    protected JLabel labelType = new JLabel("Type:");

    //PanelForCollectButton
    protected JPanel panelCollectButton = new JPanel();
   
    //collecButton
    protected ButtonGroup buttonGroup = new ButtonGroup();
    protected JRadioButton buttonStudent = new JRadioButton("Student", true);
    protected JRadioButton buttonTeacher = new JRadioButton("Teacher", false);


    
    
    


    public PersonFormV1(String windowName) {
        super(windowName);// TODO Auto-generated constructor stub
    }

    protected void addComponents() {
        super.addComponents();
        panelAll.setLayout(new GridLayout(5, 2)); // 3x2
        panelAll.add(labelName);
        panelAll.add(textfieldName);      
        panelAll.add(labelHeight);  
        panelAll.add(heightTextField); 
        panelAll.add(labelWeight);
        panelAll.add(weightTextField);    
        panelAll.add(labelBirth);   
        panelAll.add(birthTextField);

        
        //addEachButtontoGroup
        buttonGroup.add(buttonStudent);
        buttonGroup.add(buttonTeacher);

        //add-EachButton-to-Panelbutton and-->set Grid
        panelCollectButton.add(buttonStudent);
        panelCollectButton.add(buttonTeacher);
        

        //Add Label and PanelButton to panelAll
        panelAll.add(labelType);
        panelAll.add(panelCollectButton);
        //add panelAll to panel
        panel.add(panelAll);       
    }

    protected static void createAndShowGUI() {
        PersonFormV1 personV1 = new PersonFormV1("Person Form V1");
		personV1.addComponents();
		personV1.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}

		


