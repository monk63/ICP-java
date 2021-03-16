import java.io.IOException;
/**
 * Part C Question 2
 */
public class ArrayOutput  {
    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
 int array_variable [] = new int[10]; //Note how the array is created (size)

 /**
  * Try and catch exception
  */
 try{ for (int i = 0; i < 10; ++i)
 {
    array_variable[i] = i;
    System.out.print(array_variable[i] + " ");
      i++;
 }
}
//ArrayIndexOutOfBoundsExceptio
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid");
}
}   
}

