/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 7/3/2020
 */
package phutsay.preyanuch.lab9;
public class CanvasDrawerV5 extends CanvasDrawerV4 {


    private static final long serialVersionUID = 1L;
    

    public CanvasDrawerV5(){
        super();
    }

    
    public int randomVelocity(){
        int MAX_SPEED = 2;
        int MIN_SPEED = -2;
        double numRandom = (Math.random()*((MAX_SPEED - MIN_SPEED)+1));
        int velocity = (MIN_SPEED + (int) numRandom);
        return velocity;
    }

    @Override
    public void run() {
        int yVelocity = ball.getyVelocity();
        int xVelocity = ball.getxVelocity();
        while (true) {

            // check if the ball hit the corners and reset ball's position when it dissapear
            if (ball.getX() <= 0 && (ball.getY() + Ball.BALL_DIAMETER/2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER/2.0 >= 350)) {
                ball.setxVelocity(xVelocity *= -1);

            } else if (ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH && (ball.getY() + Ball.BALL_DIAMETER/2.0 <= 150 
                        || ball.getY() + Ball.BALL_DIAMETER/2.0 >= 350)) {
                ball.setxVelocity(xVelocity *= -1);
                
            } else if (ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                ball.setyVelocity(yVelocity *= -1);

            } else if (ball.getX() + Ball.BALL_DIAMETER >= keeperRight.getX() && ball.getY() + Ball.BALL_DIAMETER /2 >= keeperRight.getY()        
                        && ball.getY() + Ball.BALL_DIAMETER /2 <= keeperRight.getY() + Keeper.KEEPER_HEIGHT) {
                ball.setxVelocity(xVelocity * -1);         

            } else if(ball.getX() <= keeperLeft.getX() + Keeper.KEEPER_WIDTH && ball.getY() + Ball.BALL_DIAMETER /2 >= keeperLeft.getY() 
                        && ball.getY() + Ball.BALL_DIAMETER /2 <= keeperLeft.getY() + Keeper.KEEPER_HEIGHT) {
                ball.setxVelocity(xVelocity * -1);

            } else if ((ball.getX() <= 0 || ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH)
                && (ball.getX() > CANVAS_WIDTH || ball.getX() < CANVAS_WIDTH)) {
                ball.x = (CANVAS_WIDTH/2) - (Ball.BALL_DIAMETER/2);
                ball.y = (CANVAS_HEIGHT/2) - (Ball.BALL_DIAMETER/2);
            }

            ball.move();  // move the ball
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
  
            }
        }

    }
    
}