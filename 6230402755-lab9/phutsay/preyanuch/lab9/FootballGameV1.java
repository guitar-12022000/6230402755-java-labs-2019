/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 1/3/2020
 */
package phutsay.preyanuch.lab9;
import javax.swing.*;
import java.awt.*;
class FootballGameV1 extends GraphicsMoverV4{

    private static final long serialVersionUID = 1L;

    protected CanvasDrawerV3  canvasPanel3;

    public FootballGameV1(String windowName) {
        super(windowName);
    }

    public void drawPanel() {
        super.drawPanel();
        canvasPanel3 = new CanvasDrawerV3();
        canvasPanel3.setPreferredSize(new Dimension(800,500));
    }
    public void addComponents(){
        super.addComponents();
        drawPanel();
        bigPanel.add(canvasPanel3, BorderLayout.CENTER);
        bigPanel.add(panelButton, BorderLayout.SOUTH);
        window.add(bigPanel);
    }


    public static void createAndShowGUI() {
        FootballGameV1 fGameV1 = new FootballGameV1("Football Game V1");
        fGameV1.drawPanel();
        fGameV1.setFrameFeatures(); 
        fGameV1.addComponents();
        //if you wrong order it's error will like Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
        
        
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}