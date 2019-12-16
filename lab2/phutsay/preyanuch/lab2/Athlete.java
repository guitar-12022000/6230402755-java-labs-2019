/** 
  * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality> 
*
*Author: Preyanuch Phutsay
* ID: 623040275-5
* Sec: 2
* Date: December 13, 2019
**/

package phutsay.preyanuch.lab2;
public class Athlete{
    public static void main(String[] args){
        if (args.length == 3) {
            String athleteName = args[0];
        String sportName = args[1];
        String nationality = args[2];
        System.out.println("My favorite athlete is "+ athleteName + " who plays " + sportName + " javaand has nationality as " + nationality); 
    
        } else { 
            System.out.println("Athlete <athlete_name> <sport_name> <nationality>");
        }
        
        
       
    }
}

 