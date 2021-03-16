/**
 * To explore ways of using Dates
 */


/**
 * Libraries for Class
 */
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author David Ebo Adjepon-Yamoah
 *
 */

public class DatePractice {

	/**
	 * Constructor
	 */
	public DatePractice() {
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Imported Class: Calendar
		Calendar calendar = Calendar.getInstance(Locale.UK); // GregorianCalendar
		long startTime = calendar.getTimeInMillis();
		System.out.println("Start of Execution: "+startTime);
				
		//Imported Class: Date
		Date date = new Date();
		
		//Imported Class: SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		
		System.out.println("	"+date);
		System.out.println("	"+sdf.format(date));
		
		/* Uncomment to see longer execution times
		 * for (int i=0; i<=1000000; i++) {
			System.out.print("");
		}*/
		
		System.out.println("	Calendar Time:"+calendar.getTime());
		System.out.println("	Milliseconds: "+calendar.getTimeInMillis());
		
		Calendar calendarEnd = Calendar.getInstance(Locale.UK); // GregorianCalendar
		long endTime = calendarEnd.getTimeInMillis();
		System.out.println("End of Execution: "+endTime);
		
		//Calculating the Execution Time
		System.out.println("[Time of Execution]:------> "+(endTime - startTime)+" ms");
	}

}