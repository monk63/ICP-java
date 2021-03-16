/**
 * author Michael Nana Kofi Ofori
 * FileNotFoundException
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class CheckedExceptions{
    public static void main(String args[]){
        try{
        File file = new File("/home/icp/file.txt");
        FileReader fileReader = new FileReader(file);
        
        }
        catch(FileNotFoundException e){
          System.out.println("Error File Not Accessible");
        }
        catch(Exception e){
            e.printStackTrace();
          }
          finally{
            System.out.println("I will be executed");

          }
        
    
    
    
    }
}
