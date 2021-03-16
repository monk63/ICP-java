/*
	Trial 1
	Create a program that does three things in parallel:
	1. Print the numbers one to 1 million on the screen.
	2. Save key value pairs in a hashMap. The keys are Integers one to 1000. The
	values are the corresponding square roots (saved as doubles). After
	saving them in the hash map, print out the key value pairs
	3. Write into a file all the multiples of 4 between 5000 and 20,000 and their
	corresponding cube root in a file. The file will be formatted as follows; 
	Number 	Square
	5000 	17.100 
	5004 	17.104 .....
	For each thread, print out when the thread has completed. Also print out when the main thread 
	completes its last statement.
*/

import java.util.*;
import java.io.*;

public class ThreadTrial{

	static class Counter extends Thread{
		Counter(String name){
			super(name);
		}

		public void run(){
			for (int i = 1; i <= 1000; i++) {
				System.out.println("i is " + i);
			}
			System.out.println("Counter completed");
		}
	}

	static class Container extends Thread{
		Container(String name){
			super(name);
		}

		public void run(){
			HashMap<Integer, Double> hm = new HashMap<>();
			System.out.println("HashMap started");
			for (int i = 1; i <= 1000; i++) {
				hm.put(i, Math.sqrt(i));
			}
			System.out.println(hm);
			System.out.println("HashMap completed");
		}
	}

	public static void main(String[] args){
		Counter counter = new Counter("counter thread");
		Container container = new Container("container thread");

		counter.start();
		container.start();

		PrintWriter pw = null;
		try{
			pw = new PrintWriter("trial.txt"); 
			pw.println("Number\tSquare"); 
			for (int i = 5000; i <= 20000; i+=4) {
				pw.println(i + "\t" + Math.cbrt(i));
			}
			pw.close();
		}
		catch(Exception e){ 
			System.out.println(e.toString());
		}
		System.out.println("Printing completed");
	}


}
 try{
                FileWriter writer =  new FileWriter(votenum);
                for(Object e : votes.values()){
                    writer.write(String(votes.values));
                }

            }
            catch(FileNotFoundException e){
                System.out.println("File cannot be found");
            } catch (IOException e) {
                e.printStackTrace();
            }