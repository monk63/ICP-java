/**
 * author Michael Nana Kofi Ofori
 * UnCheckedExceptions
 */



public class UnCheckedExceptions{
public static void main(String args[]) {
       // "Number" is not a integer, it is string
       
       //NumberFormatException
       try{
        int number = Integer.parseInt ("Number");
        System.out.println(number);
       }catch(NumberFormatException e){
           System.out.println("Error the input does not match the corresponding type: ");
       }
    }


    }
