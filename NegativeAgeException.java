public class NegativeAgeException extends Exception{
	/**
     *Instance Variables
     */
    private static final long serialVersionUID = 1L;
    private int age;

	/**
     * Constructor
     * @param age
     */
	public 	NegativeAgeException(int age){
        super();
         this.age=age; 
        }

        //Person class -setter
        public void setAge(int age){
            this.age=age;
        }

public String toString(){
     return "Age can't be negative";
}
public static void main(String args[]) throws Exception {
    
    NegativeAgeException obj = new 	NegativeAgeException( 10 );
	if(obj.age < 0){
        try{
        throw new NegativeAgeException(obj.age);
    } catch (NegativeAgeException e){
        e.printStackTrace();
    }}
	else{	
		System.out.println("Entered age is: " +obj.age);}
      
}
}
