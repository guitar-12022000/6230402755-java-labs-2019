/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 7/2/2020
 */

package phutsay.preyanuch.lab6;

import java.awt.*;
import javax.swing.*;


class PersonFormV3 extends PersonFormV2{
    //Hobbies
    protected JLabel labelHob = new JLabel("Hobbies:");
    protected String[] hob = {"Reading", "Traveling", "Cooking", "Photography"};
    protected JList listHob = new JList(hob);
    protected JPanel panelHob = new JPanel();

    //File
    protected JMenu file = new JMenu("File");
    protected JMenuItem itemNew = new JMenuItem("New");
    protected JMenuItem itemOpen = new JMenuItem("Open"); 
    protected JMenuItem itemSave = new JMenuItem("Save"); 
    protected JMenuItem itemExit = new JMenuItem("Exit"); 

    //Config
    protected JMenu config = new JMenu("Config");
    protected JMenuItem itemColor = new JMenuItem("Color");
    protected JMenuItem itemSize = new JMenuItem("Size");

    //Bar File and Config
    protected JMenuBar bar = new JMenuBar();


    public PersonFormV3(String windowName) {
		super(windowName);	
	}

    protected void addMenus() {
        //File
        file.add(itemNew);
        file.add(itemOpen);
        file.add(itemSave);
        file.add(itemExit);
        bar.add(file);
        //Config
        config.add(itemColor);
        config.add(itemSize);
        bar.add(config);  
        window.setJMenuBar(bar);
    }
    
    protected void addComponents() {
        super.addComponents();
        //Hob
        panelHob.add(labelHob);
        panelHob.add(listHob);
        panelHob.setLayout(new GridLayout(1,2));
        panelAll22.add(panelHob,BorderLayout.CENTER);           
    }

    protected static void createAndShowGUI() {
        PersonFormV3 personV3 = new PersonFormV3("Person Form V3");
        personV3.addComponents();
        personV3.addMenus();
		personV3.setFrameFeatures();
    } 
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}

