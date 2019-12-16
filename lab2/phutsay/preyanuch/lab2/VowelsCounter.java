/** 
  *This is VowelsCounter Program
*
*Author: Preyanuch Phutsay
* ID: 623040275-5
* Sec: 2
* Date: December 16, 2019
**/
package phutsay.preyanuch.lab2;
public class VowelsCounter{
    public static void main(String [] args){
        String letter = args[0]; //get letter argument
        int count = 0; // set count at zero
        for (int i=0 ; i<letter.length(); i++){//i is index of letter
            String vowel = String.valueOf(letter.charAt(i));//convert letter.charAt(i) to String
        
            if(vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e") || vowel.equalsIgnoreCase("i") ||
                vowel.equalsIgnoreCase("o") || vowel.equalsIgnoreCase("u"))//accept LowerCase and UpperCase
                {
                count += 1;
            }
        
    
        }System.out.println("Total number of towels is " + count);
    }
}