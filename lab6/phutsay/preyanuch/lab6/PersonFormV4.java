/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 8/2/2020
 */
package phutsay.preyanuch.lab6;
import javax.swing.*;
import java.net.URL;

class PersonFormV4 extends PersonFormV3{
	//Color
	protected JMenuItem red = new JMenuItem("Red");
	protected JMenuItem green = new JMenuItem("Green");
	protected JMenuItem blue = new JMenuItem("Blue");
	//Size
	protected JMenuItem sixteenth = new JMenuItem("16");
	protected JMenuItem twenty = new JMenuItem("20");
	protected JMenuItem twentyfour = new JMenuItem("24");
	//ResizeAndColor
	protected JMenu color = new JMenu("Color");
	protected JMenu size = new JMenu("Size");
	
	//Icon
	protected URL icon = this.getClass().getResource("images/new.png");

	public PersonFormV4(String windowName) {
        super(windowName);
	}

	protected void updateMenuIcon() {
        itemNew.setIcon(new ImageIcon(icon));
	}

	protected void addComponents() {
		super.addComponents();
	}

	protected void addMenus() {
		super.addMenus();	
		 	
		//Color
		color.add(red);
		color.add(blue);
		color.add(green);

		//Size
		size.add(sixteenth);
		size.add(twenty);
		size.add(twentyfour);
		//SetConfig
		config.removeAll();
		config.add(color);
		config.add(size);	
		//Icon
		updateMenuIcon(); 
	}

    protected static void createAndShowGUI() {
        PersonFormV4 personV4 = new PersonFormV4("Person Form V4");
		personV4.addComponents();
		personV4.addMenus();
		personV4.setFrameFeatures();
    }
    
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}


