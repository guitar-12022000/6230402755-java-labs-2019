/** 
  * This is NumberGuessingConfigurableGame Program
*
*Author: Preyanuch Phutsay
* ID: 623040275-5
* Sec: 2
* Date: December 23, 2019
**/
package phutsay.preyanuch.lab3;
import java.util.*;//java.util.*;(have both java.util.Random; and java.util.Scanner;)
 public class NumberGuessingConfigurableGame {
    static int answer, min, max, numTries; // static variable can be used everywhere
    static Scanner input = new Scanner(System.in);//for input all values

    public static void configure() // ask min,max,numTries
    {
        System.out.print("Enter the min value:");
        min = input.nextInt();  // minimum number wil be stored min
        System.out.print("Enter the max value:");
        max = input.nextInt();  // maximum number wil be stored min
        System.out.print("Enter the maximum number of tries:");
        numTries = input.nextInt();  // max number of try will be stored in numTries

    }

    public static int genAnswer() {
        answer = (int)(Math.random() * ((max - min) + 1)) + min;  // random number formul from HINT
        return answer; //return 
    }

    public static void playGames() {
        System.out.println("Welcome to a number guessing game!");
        int tries = 0;
        String play;
        boolean win = false;
        

        while (win == false && tries <= numTries) {
            System.out.print("Enter the number between " + min + " and " + max + ": ");
            int guess = input.nextInt();
            tries++;
            if (guess == answer) {
                System.out.println("Congratultions!");
                System.out.println("You have tried " + tries + " times");
                System.out.print("Want to play again (Y or y): ");
                play = input.next();//
                if (play.equalsIgnoreCase("y")) {
                    tries = 0;
                    win = false;  // continue while loop
                } else {
                    win = true;  // exit while loop
                    System.out.println("Thank you for playing our games. Bye!");
                }
            } else if (guess < min || guess > max) {
                System.out.println("The number must be between " + min + " and " + max);
                tries--;
            } else if (guess != answer && tries == numTries) {
                System.out.println("You have tried " + numTries + " times. You ran out of guesses");
                System.out.println("The answer is " + answer);
                System.out.print("Want to play again (Y or y): ");
                play = input.next();
                if (play.equalsIgnoreCase("y")) {
                    tries = 0;
                    win = false;  // continue while loop
                } else {
                    win = true;  // exit while loop
                    System.out.println("Thank you for playing our games. Bye!");
                }
            } else if (guess > answer) {
                System.out.println("Try a lower number!");
            } else if (guess < answer) {
                System.out.println("Try a higher number!");
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        configure();
        genAnswer();
        playGames();
    }
 }