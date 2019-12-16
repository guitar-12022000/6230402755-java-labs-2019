/** 
  *Calculator program
*
*Author: Preyanuch Phutsay
* ID: 623040275-5
* Sec: 2
* Date: December 16, 2019
**/
package phutsay.preyanuch.lab2;
import java.text.DecimalFormat;
public class Calculator{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args){
        String operator = args[0]; 
        double result = 0;
        if (operator.equals("q")||operator.equals("Q")){
            System.out.println("Quitting the program");
        } else{
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);
            if(operator.equals("/") && args[2].equals("0")){
                System.out.println("The second operand can not be zero");
            }else if (operator.equals("+")){
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + " = " + df2.format(result));
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + " = " + df2.format(result));
            } else if (operator.equals("x")){
                result = num1 * num2;
                System.out.println(num1 + "x" + num2 + " = " + df2.format(result));
            } else if  (operator.equals("/")){
                result = num1/num2;
                System.out.println(num1 + "/" + num2 + " = " + df2.format(result));
            }
                    
        }
                

    }
    
    

    }

   