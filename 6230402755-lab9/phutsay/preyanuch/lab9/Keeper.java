/**
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 28/2/2020
 */
package phutsay.preyanuch.lab9;
import java.awt.geom.*;

public class Keeper extends Rectangle2D.Double {
 
    private static final long serialVersionUID = 1L;
    
    public final static int KEEPER_WIDTH = 20;// i
    public final static int KEEPER_HEIGHT = 50;//ii
    public final static int KEEPER_SPEED = 10;//iii
    //iv\
    public Keeper(int x, int y){
        super(x,y,KEEPER_WIDTH,KEEPER_HEIGHT);

    }
    public void moveUp() {
        if (y-KEEPER_SPEED >= 150) {
            y = y-KEEPER_SPEED ;
        }
    }
    //v
    public void moveDown(){
        if( (y + KEEPER_HEIGHT + KEEPER_SPEED)<= 350 ){
            y = y + KEEPER_SPEED;
        }
    }
    
}
