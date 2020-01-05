/** 
  * This is NumberGuessingMethodGame Program
*
*Author: Preyanuch Phutsay
* ID: 623040275-5
* Sec: 2
* Date: December 23, 2019
**/
package phutsay.preyanuch.lab3;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingMethodGame {
    static int answer; // static variable can be used everywhere

    public static int genAnswer() {
        Random rand = new Random();
        answer = rand.nextInt(10);//max number is 10
        return answer;

    }
    public static void playGame() {
        System.out.println("Welcome to a number guessing game!");
        int tries = 0;
        Scanner in = new Scanner(System.in);
        int guess;

        while (tries < 5){ 

            System.out.print("Enter an integer between 1 and 10:");
            guess = in.nextInt();
            tries++; //Increasing the number set in the variable tries by 1

            if (guess == answer){
                System.out.println("Congratulations!");
                System.out.println("You have tried "+ tries + " times");
                break;
                //Since the number is correct then end
            }

            else if(guess < answer){
                System.out.println("Try a higher number!");
                //2nd thing guess is compared too.
            }

            else if(guess > answer){
                System.out.println("Try a lower number");
                //3rd thing guess is compared too.
            }
            
        
        }

        System.out.println("You have tried "+ tries + " times. You ran out of guesses");
        System.out.println("The answer is "+ answer);

    }
    public static void main(String[] args) {
        genAnswer();
        playGame();
    }
}







    

    
    