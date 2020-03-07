/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 28/2/2020
 */
package phutsay.preyanuch.lab9;
import phutsay.preyanuch.lab7.*;
import javax.swing.*;
import java.awt.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {

    private static final long serialVersionUID = 1L;
    protected CanvasDrawerV2 canvasPanel2;

    public GraphicsMoverV4(String windowName) {
        super(windowName);
    }

    public void drawPanel() {
        super.drawPanel();
        canvasPanel2 = new CanvasDrawerV2();
        canvasPanel2.setPreferredSize(new Dimension(800, 500));
        moveUp.setText("Move Left Up");
        moveDown.setText("Move Left Down");
        moveRight.setText("Move Right Up");
        moveLeft.setText("Move Right Down");
    }

    public void addComponents() {
        super.addComponents();
        bigPanel.add(canvasPanel2, BorderLayout.CENTER);
        bigPanel.add(panelButton, BorderLayout.SOUTH);
        window.add(bigPanel);
    }

    public static void createAndShowGUI() {
        GraphicsMoverV4 gmV4 = new GraphicsMoverV4("Graphics Mover Version 4");
        gmV4.drawPanel();
        gmV4.setFrameFeatures();
        gmV4.addComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
