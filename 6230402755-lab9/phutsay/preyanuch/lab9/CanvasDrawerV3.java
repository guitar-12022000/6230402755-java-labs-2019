/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 1/3/2020
 */
package phutsay.preyanuch.lab9;

public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {

    private static final long serialVersionUID = 1L;
    protected Thread running;

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);
        int xv = 1;
        int yv = 2;
        ball.setyVelocity(yv);
        ball.setxVelocity(xv);
        running.start();
    }

    public void run() {
        int yVelocity = ball.getyVelocity();
        int xVelocity = ball.getxVelocity();
        while (true) {
            if (ball.getX() <= 0 && (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150
                    || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350)) {
                ball.setxVelocity(xVelocity *= -1);

            } else if (ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH
                    && (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150
                            || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350)) {
                ball.setxVelocity(xVelocity *= -1);

            } else if (ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                ball.setyVelocity(yVelocity *= -1);
            }

            ball.move();
            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

}