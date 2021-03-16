
/**
 *
 * @author Ngoh Rodney
 */
public class StringOperation{
    
    //constructor
    public StringOperation(){}
    
    /**
     * 
     * @param text
     * @return String
     * @brief This method gets substrings without repetition.
     */
    public String listOfAllSubstrings (String text) { 
        String s="";
        for(int i=0;i<text.length();i++){
           for(int j=i;j<text.length();j++){
               //concatenating substrings and separating them with " " character.
               // j+1 b/c we want to always capture the last character of each string.
               s+=text.substring(i,j+1)+" "; 
           }
        }       
        return s;
    }
    
    /**
     * @param word
     * @return boolean
     * @brief checks if word has a repeating character.
    */
    public boolean checkWord(String word){
        //strings with only one character do not repeat.
        if(word.length()==1) return true; 
        
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)) return false; //there is a repeating character.
            }
        }
        return true; //word does not have any repeating characters.
    }
    
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        StringOperation so = new StringOperation();
        try{
            String str = so.listOfAllSubstrings("pickoutthelongestsubstring"); //pickoutthelongestsubstring
            
            System.out.println("All strings without character repeats: "+"\n"+str);
            
            //converting string literal into an array of string.
            String[] stringList =str.split(" ");
         
            String nonrepeats="";
            
            for (String stringList1 : stringList) {
                if(so.checkWord(stringList1)==true) nonrepeats+=stringList1+" ";
            }
            
            
            String[] nonrepeatsList = nonrepeats.split(" ");
            String max = ""; //
            //checking for the longest nonrepeat
            for(String nonrepeatsList1:nonrepeatsList){
                //swap max with the new longest non-repeating substring
                if(nonrepeatsList1.length()>max.length()) max=nonrepeatsList1;
            }
            
            System.out.println("\n"+"The longest string without any repeating character is:     "+max);
        }catch(Exception e){e.printStackTrace();} 
   
    }  
        
}
