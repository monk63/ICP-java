

    class myThread extends Thread{
      //Method
      public void run(){
        synchronized(this){
        System.out.println("goodbye");
        notify();
        }
      }
    }
    
   
   
   
    public class threadLab {
    public static void main(String [] args){
        myThread t1=new myThread();
        t1.start();
        synchronized(t1){
            System.out.println("Hello");
            try {
                t1.wait();
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            
        }

    }

    }
}
