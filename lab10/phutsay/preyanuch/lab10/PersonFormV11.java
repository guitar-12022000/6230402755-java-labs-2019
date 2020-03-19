/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 8/3/2020
 */
package phutsay.preyanuch.lab10;

import javax.swing.*;

import java.awt.event.*;
import java.io.File;
import java.awt.*;

import phutsay.preyanuch.lab8.*;

public class PersonFormV11 extends PersonFormV10{


    private static final long serialVersionUID = 1L;
    protected JMenuItem itemCustom = new JMenuItem("Custom");;
    protected JColorChooser chooseColor;
    protected JOptionPane dialogTest;
    
    protected Object[] options = {"OK", "Cancel", "Reset"};

    protected Color fontColor;
    protected int sourceDialog, sourceOpenFileChooser, sourceSaveFileChooser;
    protected JFileChooser openFileChooser, saveFileChooser;

   
    public PersonFormV11(String window) {
        super(window);
    }
 
    @Override
    protected void addComponents() {
        super.addComponents();    
        openFileChooser = new JFileChooser();   
        saveFileChooser = new JFileChooser();
        
    } 
    @Override
    protected void addMenus() {
        super.addMenus();        
        color.add(itemCustom);   
    }
  
    public void addListeners() {
        super.addListeners();
        
        itemOpen.addActionListener(this);  
        itemSave.addActionListener(this);
        itemCustom.addActionListener(this);   
        itemExit.addActionListener(this);      
    }

   
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object source = event.getSource();
        
        if(source == itemCustom){
            
            chooseColor = new JColorChooser();
            
            chooseColor.setColor(Color.BLACK);
            
            sourceDialog = JOptionPane.showOptionDialog(this, chooseColor, "Chooser color", JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
           
            if(sourceDialog == JOptionPane.YES_OPTION){
               
                Color fontColor = chooseColor.getColor();
                textfieldName.setForeground(fontColor);
                heightTextField.setForeground(fontColor);
                weightTextField.setForeground(fontColor);
                birthTextField.setForeground(fontColor);
                textNote.setForeground(fontColor);
            }
            
            if(sourceDialog == JOptionPane.CANCEL_OPTION){
                
                chooseColor.setColor(Color.BLACK);
                Color fontColor = chooseColor.getColor();
                textfieldName.setForeground(fontColor);
                heightTextField.setForeground(fontColor);
                weightTextField.setForeground(fontColor);
                birthTextField.setForeground(fontColor);
                textNote.setForeground(fontColor);
                
            }
            
        }else if(source == itemOpen){     
          
            sourceOpenFileChooser = openFileChooser.showOpenDialog(this);
            
            if(sourceOpenFileChooser == JFileChooser.APPROVE_OPTION){
              
                StringBuffer messageShowOpen = new StringBuffer();
                File file = openFileChooser.getSelectedFile();
                String fileChoosed = "Opening file " + file.getName();
                messageShowOpen.append(fileChoosed);
                JOptionPane.showMessageDialog(this, messageShowOpen, "Message", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
            }
           
            if(sourceOpenFileChooser == JFileChooser.CANCEL_OPTION){
                
                StringBuffer messageShowOpen = new StringBuffer();
                String fileChoosed = "Open command cancelled by user.";
                messageShowOpen.append(fileChoosed);
                JOptionPane.showMessageDialog(this, messageShowOpen, "Message", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
            }
        }else if(source == itemSave){     
            sourceSaveFileChooser = saveFileChooser.showSaveDialog(this);
            
            if(sourceSaveFileChooser == JFileChooser.APPROVE_OPTION){
                
                StringBuffer messageShowSave = new StringBuffer();
                File file = saveFileChooser.getSelectedFile();
                String fileChoosed = "Saving file " + file.getName();
                messageShowSave.append(fileChoosed);
                JOptionPane.showMessageDialog(this, messageShowSave, "Message", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
            }
           
            if(sourceSaveFileChooser == JFileChooser.CANCEL_OPTION){
               
                StringBuffer messageShowSave = new StringBuffer();
                String fileChoosed = "Save command cancelled by user.";
                messageShowSave.append(fileChoosed);
                JOptionPane.showMessageDialog(this, messageShowSave, "Message", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(icon));
            }
        }else if(source == itemExit){            
            System.exit(0);
        }      
        
    }

    public static void createAndShowGUI() {
        PersonFormV11 personFormV11 = new PersonFormV11("Person Form V11");   
        personFormV11.addComponents();      
        personFormV11.addMenus();          
        personFormV11.addListeners();       
        personFormV11.setFrameFeatures();  
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}




