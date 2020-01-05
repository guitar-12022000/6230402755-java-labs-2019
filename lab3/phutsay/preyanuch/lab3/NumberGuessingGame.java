/** 
  * This is NumberGuessingGame Program
*
*Author: Preyanuch Phutsay
* ID: 623040275-5
* Sec: 2
* Date: December 23, 2019
**/
package phutsay.preyanuch.lab3;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static int number; // static variable can be used everywhere

    public static void main(String[] args){
        System.out.println("Welcome to a number guessing game!");

        Random rand = new Random();
        number = rand.nextInt(10);//max number is 10
        int tries = 0; //Will increase depending on how many tires it takes
        Scanner input = new Scanner(System.in);
        int guess;
        

        while (tries < 5){ 

            System.out.print("Enter an integer between 1 and 10:");
            guess = input.nextInt();
            tries++; //Increasing the number set in the variable tries by 1

            if (guess == number){
                System.out.println("Congratulations!");
                System.out.println("You have tried "+ tries + " times");
                System.exit(0);
                //Since the number is correct then end
            }

            else if(guess < number){
                System.out.println("Try a higher number!");
                //2nd thing guess is compared too.
            }

            else if(guess > number){
                System.out.println("Try a lower number");
                //3rd thing guess is compared too.
            }
            
        
        }

        System.out.println("You have tried "+ tries + " times. You ran out of guesses");
        System.out.println("The answer is "+ number);

    }

}
