package phutsay.preyanuch.lab2;
public class VowelsCounter{
    public static void main(String [] args){
        String letter = args[0];
        int count = 0;
        for (int i=0 ; i<letter.length(); i++){
            String vowel = String.valueOf(letter.charAt(i));
        
        if(vowel.equalsIgnoreCase("a") || vowel.equalsIgnoreCase("e") || vowel.equalsIgnoreCase("i") || vowel.equalsIgnoreCase("o") || vowel.equalsIgnoreCase("u")){
            count += 1;
        }
        System.out.println("Total number of towels is " + count);
    
    }
}
}