/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 2/2/2020
 */
package phutsay.preyanuch.lab6;
import java.awt.*;
import javax.swing.*;


class PersonFormV2 extends PersonFormV1{
    //Sports
    protected JLabel labelSports = new JLabel("Sports:");
    protected String sports[]={"Running","Swimming","Tennis"};        
    protected JComboBox sportbox = new JComboBox(sports);    
    protected JPanel panelSports = new JPanel();
    //Note
    protected JLabel labelNote = new JLabel("Note:");
    
    protected JTextArea textNote = new JTextArea(3,35);
    protected JScrollPane noteScrollPane = new JScrollPane(textNote);

    protected JPanel panelNote = new JPanel(new BorderLayout());
    
    //panelAll2
    protected JPanel panelAll2 = new JPanel(new BorderLayout());

    protected JPanel panelAll22 = new JPanel(new BorderLayout());
  

    public PersonFormV2(String windowName) {
        super(windowName);    
    }

    protected void addComponents() {
        super.addComponents();
        //Sports
        panelSports.add(labelSports);
        panelSports.add(sportbox);
        sportbox.setSize(200, sportbox.getPreferredSize().height);

        panelSports.setLayout(new GridLayout(1,2));
        //Notes
        textNote.setRows(2);
        textNote.setText("21st Century skills include Critical thinking, Creativity, ");
        textNote.append("Collaboration, Communication, etc.");
        
        textNote.setLineWrap(true);
        textNote.setWrapStyleWord(true);

        panelNote.add(labelNote,BorderLayout.WEST);
        panelNote.add(noteScrollPane, BorderLayout.SOUTH);

        //panelAll2
        panelAll2.add(panelAll, BorderLayout.NORTH);
        panelAll2.add(panelSports, BorderLayout.SOUTH);
        // panelAll2.add(panelNote, BorderLayout.SOUTH);
        panelAll22.add(panelAll2,  BorderLayout.NORTH);
        panelAll22.add(panelNote, BorderLayout.SOUTH);
        panel.add(panelAll22);        
    }

    protected static void createAndShowGUI() {
        PersonFormV2 personV2 = new PersonFormV2("Person Form V2");
		personV2.addComponents();
		personV2.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}

