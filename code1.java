/**
 * Michael Ofori
 * Part C
 * Question 1
 */
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class code1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		//Imported Class: Calendar
		Calendar calendar = Calendar.getInstance(Locale.UK);
		long startTime = calendar.getTimeInMillis();
		System.out.println("Start of Execution: "+startTime);
				
		//Imported Class: Date
		Date date = new Date();
		
		//Imported Class: SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		
		System.out.println("	"+date);
		System.out.println("	"+sdf.format(date));

    // This section of the code reverses the words the user types using recursion.
        String  word; // For storing users input.
	
		for (int i=0;i<5;i++){
    //Methods to take inpput from the user.
    System.out.println("Enter your sentence: ");

    Scanner input= new Scanner(System.in);
    word=input.nextLine();
    input.close();

    //Recusion method
    String reverse=reversedString(word); //For storing reverse of the string.

    System.out.println("This is the reverse of the string: "+reverse);
        		
		System.out.println("	Calendar Time:"+calendar.getTime());
		System.out.println("	Milliseconds: "+calendar.getTimeInMillis());
		
		Calendar calendarEnd = Calendar.getInstance(Locale.UK); // GregorianCalendar
		long endTime = calendarEnd.getTimeInMillis();
		System.out.println("End of Execution: "+endTime);
		
		//Calculating the Execution Time
		System.out.println("[Time of Execution]:------> "+(endTime - startTime)+" ms");
		System.out.println("Average time "+(endTime - startTime)/5+" ms");
	}
}

       //Method for reversing if the string using recursion.
private static String reversedString(String w) {
    if(w.isEmpty())  //Checks if the string is empty
    return w;
    return reversedString(w.substring(1))+w.charAt(0);  
}
}
