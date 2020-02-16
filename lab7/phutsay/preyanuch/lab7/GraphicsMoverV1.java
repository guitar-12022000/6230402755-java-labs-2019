/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 12/2/2020
 */
package phutsay.preyanuch.lab7;
import phutsay.preyanuch.lab6.*;
import javax.swing.*;
import java.awt.*;


class GraphicsMoverV1 extends MySimpleWindow{

    //BigPanel
    protected JPanel bigPanel = new JPanel(new BorderLayout());
    //CanvasPanel
    CanvasDrawerV1 canvasPanel;
    protected int CANVAS_WIDTH = 800;
    protected int CANVAS_HEIGHT = 500;
    //ButtonPanel
    protected JPanel panelButton = new JPanel(new FlowLayout());
    //ButtomButton
    protected JButton moveUp = new JButton("Move up");
    protected JButton moveDown = new JButton("Move down");
    protected JButton moveLeft = new JButton("Move left");
    protected JButton moveRight = new JButton("Move right");
    protected JButton reset = new JButton("Reset");
    
    //Title
    public GraphicsMoverV1(String windowName) {
        super(windowName);
    }
    //SetPanel
    public void drawPanel() {
        //SetCanvas
        canvasPanel = new CanvasDrawerV1();
        canvasPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        //AddButtonToButtonPanel
        panelButton.add(moveUp);
        panelButton.add(moveDown);
        panelButton.add(moveLeft);
        panelButton.add(moveRight);
        panelButton.add(reset);
        //AddPanel
        bigPanel.add(canvasPanel, BorderLayout.CENTER);
        bigPanel.add(panelButton, BorderLayout.SOUTH);
        //AddBigPaneltoWindow
        window.add(bigPanel);
    }
    //Create and Show
    protected static void createAndShowGUI() {
        GraphicsMoverV1  gmV1 = new GraphicsMoverV1("Graphics Mover Version 1");
        gmV1.drawPanel();
        gmV1.setFrameFeatures();
    }
    public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
				
			}
		});
	}
}
//CreateCanvas
class CanvasDrawerV1 extends JPanel{
    
    protected int DOT_CIRCLE_RADIUS = 5;
    protected int CIRCLE_RADIUS = 50;
    protected Color CANVAS_BACKGROUND = Color.GREEN;
    protected BasicStroke LINE_WIDTH = new BasicStroke(4f); 
    //Dot
    protected int xLeftDot;  
    protected int xRightDot;
    protected int yBothDot;
    protected int w_h_Dot;
    //Circle
    protected int xCircle;
    protected int yCircle;
    protected int w_h_Circle;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(CANVAS_BACKGROUND);  
        int width = this.getWidth();
        int height = this.getHeight();
        Graphics2D g2d = (Graphics2D) g;
        //CenterLine
        g2d.setStroke(LINE_WIDTH);  
        g2d.setColor(Color.BLACK); 
        g2d.drawLine(width/2, 0, width/2, height); 
        //LeftRect
        g2d.drawRect(0, 80, 150, 340); 
        g2d.drawRect(0, 150, 60, 200);
        //RightRect
        g2d.drawRect(width-150, 80, 150, 340);
        g2d.drawRect(width-60, 150, 60, 200);
        //Dot
        xLeftDot = 105 - DOT_CIRCLE_RADIUS;
        xRightDot = width - 105 - DOT_CIRCLE_RADIUS;
        yBothDot = height-250-DOT_CIRCLE_RADIUS;
        w_h_Dot = DOT_CIRCLE_RADIUS*2;
        g2d.fillOval(xLeftDot, yBothDot, w_h_Dot, w_h_Dot);//LeftDot
        g2d.fillOval(xRightDot, yBothDot, w_h_Dot, w_h_Dot);//RightDot
        //Circle
        xCircle = (width/2)-CIRCLE_RADIUS;
        yCircle = (height/2)-CIRCLE_RADIUS;
        w_h_Circle = CIRCLE_RADIUS*2;
        g2d.setColor(Color.WHITE);
        g2d.drawOval(xCircle,yCircle, w_h_Circle, w_h_Circle);        
    }
}
