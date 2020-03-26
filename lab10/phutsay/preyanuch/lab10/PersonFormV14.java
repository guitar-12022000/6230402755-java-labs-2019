/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 25/3/2020
 */
package phutsay.preyanuch.lab10;
import javax.swing.*;
import java.io.*;

public class PersonFormV14 extends PersonFormV13 {
    private static final long serialVersionUID = 1L;

    FileOutputStream fOStream;
    ObjectOutputStream oOStream;
    FileInputStream fInputStream;
    ObjectInputStream oInputStream;

    public PersonFormV14(String title) {
        super(title);
    }

    public Object getAbsolutePath() {
        String personFile = "";
        for (int i = 0; i < personArray.size(); i++) {
            if (personArray.size() == 1 && i == personArray.size() -1 ) {
                personFile += personArray.get(i);
            } else if (personArray.size() != 1 && i == personArray.size() -1 ) {
                personFile += personArray.get(i) +  "\n";
            } else if (personArray.size() > 1 && i != personArray.size()-1) {
                personFile += personArray.get(i) + "\n , ";
            }
        }
        return personFile;
    }

    @Override
    public void handleSaveMenu() {
        int value = fileChooser.showSaveDialog(PersonFormV14.this);// choose file to save dialog
            if (value == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    fOStream = new FileOutputStream(file);
                    oOStream = new ObjectOutputStream(fOStream);
                    oOStream.writeObject(getAbsolutePath());
                    oOStream.close();
                    fOStream.close();
                } catch (Exception ex){
                    ex.printStackTrace(System.err);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Save command cancelled by user.");
            }
    }

    @Override
    public void handleOpenMenu() {
        int value = fileChooser.showOpenDialog(PersonFormV14.this);//choose select file to open dialog
            if (value == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    fInputStream = new FileInputStream(file);
                    oInputStream = new ObjectInputStream(fInputStream);
                    Object person = oInputStream.readObject();
                    JOptionPane.showMessageDialog(null, person);
                } catch (Exception ex){
                    ex.printStackTrace(System.err);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Open command cancelled by user.");
            }
    }

    public static void createAndShowGUI() {
        PersonFormV14 pFormV14 = new PersonFormV14("Person Form V14"); 
        pFormV14.addMenus();
        pFormV14.addComponents();   
        pFormV14.addListeners();     
        pFormV14.setFrameFeatures();   
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}