/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 28/2/2020
 */
package phutsay.preyanuch.lab9;
import phutsay.preyanuch.lab7.*;
import java.awt.*;
//c

public class CanvasDrawerV2 extends CanvasDrawerV1 {

    private static final long serialVersionUID = 1L;

    protected Ball ball;
    protected Keeper keeperLeft;
    protected Keeper keeperRight;

    public CanvasDrawerV2() {
        super();
        ball = new Ball(CANVAS_WIDTH / 2 - Ball.BALL_DIAMETER / 2, CANVAS_HEIGHT / 2 - Ball.BALL_DIAMETER / 2);
        keeperLeft = new Keeper(0, (CANVAS_HEIGHT / 2) - (Keeper.KEEPER_HEIGHT / 2));
        keeperRight = new Keeper(CANVAS_WIDTH - Keeper.KEEPER_WIDTH, (CANVAS_HEIGHT / 2) - (Keeper.KEEPER_HEIGHT / 2));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // DrawBall
        g2d.setColor(Color.ORANGE);
        g2d.fill(ball);
        // drawkeepperLeft
        g2d.setColor(Color.BLUE);
        g2d.fill(keeperLeft);
        // drawkeeperRight
        g2d.setColor(Color.RED);
        g2d.fill(keeperRight);
    }
}
