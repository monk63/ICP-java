import java.util.ArrayList;

/**
 * @author Michael Nana Kofi Ofori
 * Class for Voter.
 */
public class Voter extends Person{

	private static ArrayList<Voter> voted=new ArrayList<>();

	private long voterId;
	private static int count;
	private String homeTown;
	private String pollingStation;

	public Voter(String name, int age, char gender, int id, String location,String homeTown, long voterId, String pollingStation) {
		super(name, age, gender, id, location);
		this.voterId = voterId;
		this.homeTown=homeTown;
		this.pollingStation=pollingStation;
		count++;
	}
	/**
	 * @return the voters id
	 */
	public long getVoterId() {
		return voterId;
	}
	/**
	 * @param voterId to set
	 */
	public void setvoterId(int voterId) {
		this.voterId = voterId;
	}
	/**
	 * @return the homeTown
	 */
	public String gethomeTown() {
		return homeTown;
	}
	/**
	 * 
	 * @param pollingStation
	 */
	public void setpollingStation(String pollingStation) {
		this.pollingStation=pollingStation;
	}
    /**
	 * 
	 * @return pollingStation
	 */
	public String getpollingStation() {
		return pollingStation;
	}

	/**
	 * @param voter
	 * @return the number of votes counted.
	 */
	public static int ballotCount() {
		 return count;	
	 }  
	 
	//To String method To Prints Attritubes of a Voter.
    public String toString(){
        return "[Voter Name:  " + getName() + " Age:  " + getAge() + " Gender:  " + getGender() + " id: " + getId()
				+ " Location: "  + getLocation() + "Home Town :"+gethomeTown()+  "Voter ID: "+ getVoterId()  + "Polling Station : "+getpollingStation()+  " ]";	
	}
}