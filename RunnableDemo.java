package icp_java_week5;

/**
 * Source: 
 * http://www.csegeek.com/csegeek/view/tutorials/java_lang/java_multithread.php
 */

/* define a class 'X' which implements 'Runnable' interface
 * ( create 1st thread )
 */
class X implements Runnable {
	
   public void run() { // define the run() method of the interface
      for ( int i = 1; i <= 5; i++ ) {
         System.out.println(Thread.currentThread().getName()+": Thread X ... i = " + i);
      }
      System.out.println("Exit from Thread X : Execution over");
   }
}

/* define a class 'Y' which implements 'Runnable' interface
 * ( create 2nd thread )
 */
class Y implements Runnable {
   public void run() {
      for ( int i = 6; i <= 10; i++ ) {
         System.out.println(Thread.currentThread().getName()+": Thread Y ... i = " + i);
      }
      System.out.println("Exit from Thread Y : Execution over");
   }
}

public class RunnableDemo {
   public static void main(String args[]) {
	   
	  //Thread thread_x = new Thread(new X());
      X obj_x = new X();
      Y obj_y = new Y();
      Thread thread_x = new Thread(obj_x);
      Thread thread_y = new Thread(obj_y);
      thread_x.start(); // start the 1st thread
      thread_y.start(); // start the 2nd thread

      /* we can replace the above set of statements by :-
         new Thread(new X()).start();
         new Thread(new Y()).start();
      */
   }
}
