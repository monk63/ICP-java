import java.util.*;

class Update implements Runnable{ 
	static int val = 0;
	
	public void run() {
		for (int i = 1; i <= 1000000; i++) { 
			val += 1;
		}
		System.out.println("Char Printing Thread has finished");
	}


	public static void doOperations() throws InterruptedException{
		Thread t1 = new Thread(new Update()); 
		t1.start();
		for (int i = 1; i < 1000000; i++)
			val += 1;
		t1.join();
		System.out.println(val);
	}

	public static void main(String args[]) throws Exception { 
		doOperations();
		System.out.println("Main Program Has Ended!");
	}
}