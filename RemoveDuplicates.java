
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * RemoveDuplicates.java
 * @author Silas sangmin
 * A program to print without repeating characters given a String
 */
public class RemoveDuplicates {

    /**
     * This method removes duplicates characters
     * @param word - word to remove duplicate characters
     * @return - Returns word after removing duplicates
     */
    public static String removeDuplicates(String word){
        // create a LinkedHashSet to collect characters
        LinkedHashSet<Character> linkedset=new LinkedHashSet<>();
        String answer="";
        for(int i=0;i<word.length()-1;i++){
            linkedset.add(word.toLowerCase().charAt(i));//add characters to linkedset. No duplicate collection
        }
        Iterator itr=linkedset.iterator(); //iterator
        while (itr.hasNext()){
            answer+=itr.next(); //add characters to answer
        }
        return answer;
    }
    public static void main(String [] args){
    System.out.println(removeDuplicates("W3resource"));
    }
}
