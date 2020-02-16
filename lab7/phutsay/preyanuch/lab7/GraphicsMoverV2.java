/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 13/2/2020
 */
package phutsay.preyanuch.lab7;
import javax.swing.*;
import java.awt.*;

class GraphicsMoverV2 extends GraphicsMoverV1{
    //Score
    protected JPanel scorePanel = new JPanel();
    protected JLabel labelKK = new JLabel("KhonKaen");
    protected JLabel labelUD = new JLabel("Udon Thani");
    protected JTextField textFieldKK = new JTextField("3");
    protected JTextField textFieldUD = new JTextField("1");
    protected Font textFieldFont = new Font("Serif", Font.BOLD, 20);//
    
    //Title
    public GraphicsMoverV2(String windowName) {
      super(windowName);
    }

    public void drawPanel(){
        super.drawPanel();
        //SetIteminScorePane
        labelKK.setForeground(Color.BLUE);
        labelUD.setForeground(Color.RED);
        textFieldKK.setFont(textFieldFont);
        textFieldUD.setFont(textFieldFont);
        //AddItemToScorePAne
        scorePanel.add(labelKK);
        scorePanel.add(textFieldKK);
        scorePanel.add(labelUD);
        scorePanel.add(textFieldUD);
        scorePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //AddScoreToBig
        bigPanel.add(scorePanel, BorderLayout.NORTH); 
    }
    //Create and Show
    protected static void createAndShowGUI() {
        GraphicsMoverV2  gmV2 = new GraphicsMoverV2("Graphics Mover Version 2");
        gmV2.drawPanel();
        gmV2.setFrameFeatures();
    }
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}   
