import java.util.Scanner;

public class reverseString {

    public static void main(String[] args)   { 

    String  word; // For storing users input.
    
    //Methods to take inpput from the user.

    System.out.println("Enter your sentence: ");

    Scanner input= new Scanner(System.in);
    word=input.nextLine();
    input.close();

    String reverse=reversedString(word); //For storing reverse of the string.

    System.out.println("This is the reverse of the string: "+reverse);

}
    //Method for reversing if the string using recursion.
private static String reversedString(String w) {
    if(w.isEmpty())  //Checks if the string is empty
    return w;
    return reversedString(w.substring(1))+w.charAt(0);  
}
    
}
