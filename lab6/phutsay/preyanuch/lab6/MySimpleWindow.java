/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 20/1/2020
 */

package phutsay.preyanuch.lab6;

import javax.swing.*;
import java.awt.*;

class MySimpleWindow extends JFrame {
	protected JPanel panel = new JPanel(new BorderLayout()); 
	protected JButton okButton = new JButton("ok");
	protected JButton cancelButton = new JButton("cancel");
	protected JFrame window;
	protected JPanel panelOkorCancel = new JPanel();

	public MySimpleWindow(String windowName) {
		window = new JFrame(windowName);
		window.setLayout(new BorderLayout());
	}

	protected void addComponents() {
		panelOkorCancel.add(cancelButton);
		panelOkorCancel.add(okButton);
		//set panelokorcancel for reuse
		panel.add(panelOkorCancel,BorderLayout.AFTER_LAST_LINE);

		window.add(panel);
	}

	protected void setFrameFeatures(){
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	protected static void createAndShowGUI() {
		MySimpleWindow msw = new MySimpleWindow("My Simple Window");
		msw.addComponents();
		msw.setFrameFeatures();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}

		
