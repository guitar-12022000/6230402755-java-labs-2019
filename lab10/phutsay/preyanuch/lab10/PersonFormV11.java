/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 8/3/2020
 */
package phutsay.preyanuch.lab10;
import phutsay.preyanuch.lab8.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PersonFormV11 extends PersonFormV10 {
    private static final long serialVersionUID = 1L;

    protected JMenuItem itemCustom = new JMenuItem("Custom");
    protected JColorChooser colorChooser;
    protected JFileChooser fileChooser = new JFileChooser();

    //title name
    public PersonFormV11(String windowName) {
        super(windowName);
    }
    //add custom item to color menu.
    public void addMenus() {
        super.addMenus();
        color.add(itemCustom);
    }

    //handle with file saving
    public void handleSaveMenu() {
        int click = fileChooser.showSaveDialog(PersonFormV11.this);
        if (click == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Saving file " + file.getName());
        } else {
            JOptionPane.showMessageDialog(null, "Save command cancelled by user.");
        }
    }
    //handle with file opening
    public void handleOpenMenu() {
        int click = fileChooser.showOpenDialog(PersonFormV11.this);
        if (click == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Opening file " + file.getName());
        } else {
            JOptionPane.showMessageDialog(null, "Open command cancelled by user.");
        }
    }

    // add listener for each Jmenuitem
    public void addListeners() {
        super.addListeners();

        itemCustom.addActionListener(this);
        itemOpen.addActionListener(this);
        itemSave.addActionListener(this);
        itemExit.addActionListener(this);
    }

    //when change textFiled color and textArea color
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object src;
        src = event.getSource();
        //if user click custom
        if (src == itemCustom) {
            Color newColor = JColorChooser.showDialog(null, "Choose color", Color.BLACK);
            //set color on foreground
            textfieldName.setForeground(newColor);
            heightTextField.setForeground(newColor);
            weightTextField.setForeground(newColor);
            birthTextField.setForeground(newColor);
            textNote.setForeground(newColor);
        }
        //event when user choose file then click open.
        if (src == itemOpen) {
            handleOpenMenu();
        //event when user choose file then click save.
        } else if (src == itemSave) {
            handleSaveMenu();
        }
        //event when user click Exit.
        if (src == itemExit) {
            System.exit(1);
        }
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV11 pFormV11 = new PersonFormV11("Person Form V11");
        pFormV11.addKeys();
        pFormV11.addMenus();
        pFormV11.addComponents();
        pFormV11.addListeners();
        pFormV11.setFrameFeatures();
    }

}