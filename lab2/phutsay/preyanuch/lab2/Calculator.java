package phutsay.preyanuch.lab2;
import java.text.DecimalFormat;
public class Calculator{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args){
        String operation = args[0]; 
        double result = 0;
        if (operation.equals("q")||operation.equals("Q")){
            System.out.println("Quitting the program");
        } else{
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);
            if (args.length == 3){
                if (operation.equals("+")){
                    result = num1 + num2;
                    System.out.println(num1 + "+" + num2 + " = " + df2.format(result));
                } else if (operation.equals("-")) {
                    result = num1 - num2;
                    System.out.println(num1 + "-" + num2 + " = " + df2.format(result));
                } else if (operation.equals("*")){
                    result = num1 * num2;
                    System.out.println(num1 + "*" + num2 + " = " + df2.format(result));
                } else {
                    if (num2 == 0){
                        System.out.println("The second operand can not be zero");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + "/" + num2 + " = " + df2.format(result));
                    }
                }
                

            }
        }
    

    }
}
   