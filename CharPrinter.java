import java.util.*;

class CharPrinter implements Runnable{ 
	private int ID;
	
	public void run() {
		for (char i = 'a'; i <= 'f'; i++) { 
			System.out.println("\t CharPrinter \t" + i); 
			try {
				Thread.sleep((long)(0.5 * 1000)); 
			} catch (InterruptedException e) {}
		}
		System.out.println("Char Printing Thread has finished");
	}


	public static void doOperations(){
		Thread t1 = new Thread(new CharPrinter()); 
		t1.start();
		for (int i = 0; i < 5; i++)
			System.out.println("Main Program " + "\t" + i);
	}

	public static void main(String args[]) throws Exception { 
		doOperations();
		System.out.println("Main Program Has Ended!");
	}
}