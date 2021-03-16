import java.util.Random;

public class Person1 {
    
    
    private String name;
    private int age;
    private double height;
    private double weight;
    private char gender;
    private Object getGender;
    

    public Person1(String name,int age,double height,double weight,char gender){
       this.name=name;
       this.age=age;
       this.height=height;
       this.gender=gender;

    }
public Person1(double height,double weight,char gender){
        this.name="baby";

}

public Person1(double d, int i, String string) {
}

public String getname() {
    return name;

}


public void setName(String name){
    this.name=name;
}

public int getage() {
    return age;

}
public void setAge(int age){
    this.age=age;
}

public char getGender() {
    return gender;

}
public void setGender(char gender){
    this.gender=gender;
}
public void walk(double distance, String direction, String destination){


}
public void eat(String food,double calories){


}
public void grow(double weight,double height){

}
public Person1 reproduce(Person1 spouse){
    if(this.getGender!= spouse.getGender && this.getage()>=16
    && spouse.getage()>=16){
        Random rand=new Random();
        boolean gender=rand.nextBoolean();
        if (gender)
        return new Person1(1.2, 12, "F");
        
        return new Person1(1.2, 12, "M");
        
    }
    else{
        return null;
    }
    

}

    
}
