/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 13/2/2020
 */
package phutsay.preyanuch.lab7;

import javax.swing.*;
import java.net.URL;

class GraphicsMoverV3 extends GraphicsMoverV2 {

    protected JMenuBar bar = new JMenuBar();// Bar
    protected JMenu file = new JMenu("File");// Menu
    protected URL icon = this.getClass().getResource("image/open.jpg");// OpenIcon
    // Item
    protected JMenuItem open = new JMenuItem("Open", new ImageIcon(icon));
    protected JMenuItem save = new JMenuItem("Save");
    protected JMenuItem quit = new JMenuItem("Quit");

    // Title
    public GraphicsMoverV3(String windowName) {
        super(windowName);
    }

    public void drawPanel() {
        super.drawPanel();
        // AddItemtoMenu
        file.add(open);
        file.add(save);
        file.add(quit);
        bar.add(file);// Add Menu to Bar
        window.setJMenuBar(bar);// setBar
    }

    // CreateAndShow
    protected static void createAndShowGUI() {
        GraphicsMoverV3 gmV3 = new GraphicsMoverV3("Graphics Mover Version 3");
        gmV3.drawPanel();
        gmV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
