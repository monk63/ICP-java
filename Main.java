public class Main {
    public static void main (String [] args){
       
        Person person1 = new Person("Michael Ofori", 21, 'M',1223,"Tema");

        
        Voter  voter1 =new Voter("Michael Ofori", 21, 'M', 1223, "Tema", "Volta",67432323,"Tema West");
        Voter  voter2 =new Voter("Zichael Zfori", 23, 'F', 1232, "Baastona","Kwahu" ,67456233,"Tema West");
        electoralOfficer electionofficer1=new electoralOfficer("Roland Robbs", 45, 'M', 234213, "Tema", 123343143,"Tema");
        candidate candidate1=new candidate("Joe Akuffo", 98, 'M', 1111, " Accra ", 2343332, 1, " Peoples Party ");

        System.out.println(person1.toString()); 

        System.out.println("                            "); 
        System.out.println(voter1.toString()); 
        System.out.println(voter2.toString());
        System.out.println("                            "); 
        
        System.out.println("Ballot Count: "+Voter.ballotCount());
        System.out.println("                            "); 
        System.out.println(electionofficer1.toString()); 
        System.out.println("                            "); 
        System.out.println(candidate1.toString()); 
        System.out.println("                            "); 
        

    }
    
}
