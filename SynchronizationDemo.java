package icp_java_week5;

/**
 * Synchronized Solution
 * @author David Ebo Adjepon-Yamoah
 */
class RangeSync {
	   /* Method body of display() is a critical section and only one thread
	    * can be inside synchronized method. Other thread can enter this method
	    * only when first thread is done with its task.
	    */
	   synchronized void display(int low, int high) {
	      System.out.println("Display between " + low + " and " + high);
	      for(int i = low; i <= high; i++) {
	         System.out.print(i + " ");
	      }
	      System.out.println();
	   }
	}

	/* HelperSync class to print the range */
	class HelperSync extends Thread {
		RangeSync r;
	   int low, high;
	   //Constructor
	   HelperSync(RangeSync r_obj, int low_limit, int high_limit) {
	      r = r_obj;
	      low = low_limit; high = high_limit;
	   }
	   public void run() {
	      r.display(low, high);
	   }
	}

	/**OUTPUT
	 * Output is in expected order :
	 * Display between 1 and 10
	 * 1 2 3 4 5 6 7 8 9 10
	 * Display between 51 and 60
	 * 51 52 53 54 55 56 57 58 59 60
	 */
	public class SynchronizationDemo {
	   public static void main(String args[]) {
	      /* we create one object to print different ranges */
		  RangeSync obj = new RangeSync();
	      /* create a thread to print between 1 to 10 */
	      HelperSync th1 = new HelperSync(obj, 1, 10);
	      /* create another thread to print between 51 to 60 */
	      HelperSync th2 = new HelperSync(obj, 51, 60);
	      th1.start();
	      th2.start();
	   }
	}
