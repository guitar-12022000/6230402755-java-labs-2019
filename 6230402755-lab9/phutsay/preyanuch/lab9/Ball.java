/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 28/2/2020
 */
package phutsay.preyanuch.lab9;

import java.awt.geom.*;

public class Ball extends Ellipse2D.Double {// i

    private static final long serialVersionUID = 1L;
    public final static int BALL_DIAMETER = 30;// ii
    private int xVelocity;// iii
    private int yVelocity;// iii

    // iV
    public Ball(int x, int y) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);
        xVelocity = 0;
        yVelocity = 0;
    }

    public Ball(int x, int y, int xVelocity, int yVelocity) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);

        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    // V
    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    // vi
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }
}