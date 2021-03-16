package icp_java_week5;

/**
 * Source: 
 * http://www.csegeek.com/csegeek/view/tutorials/java_lang/java_multithread.php
 */

/* define a class 'A' which inherits from class 'Thread'
 * ( create 1st thread )
 */
class A extends Thread {
	
	//Method 1
	
	//Method 2
   @Override
   public void run() { // override the run() method of 'Thread' class
      for ( int i = 1; i <= 5; i++ ) {
         System.out.println("Thread A ... i = " + i);
      }
      //Call Method 1 and Method 2
      System.out.println("Exit from Thread A : Execution over");
   }
}

/* define a class 'B' which inherits from class 'Thread'
 * ( create 2nd thread )
 */
class B extends Thread {
   @Override
   public void run() {
      for ( int i = 11; i <= 15; i++ ) {
         System.out.println("Thread B ... i = " + i);
      }
      System.out.println("Exit from Thread B : Execution over");
   }
}

/**
 * The output of the above program cannot be predicted. It depends on how the 
 * context switch happens between the two threads. 
 * NB: Switching of CPU from one task to another is known as context-switch, 
 * and operating system is responsible for this switching.
 * The sequence of the output MAY change every time you run the program.
 * 
 */
public class ThreadDemo {
   public static void main(String args[]) {
	  A thread_a = new A();
      B thread_b = new B();
      thread_a.start(); /* start the 1st thread ( start() is a method
                       defined in 'Thread' class ) */
      thread_b.start(); /* start the 2nd thread */

      /* we can replace the above set of statements by :-
         new A().start();
         new B().start();
      */
   }
}