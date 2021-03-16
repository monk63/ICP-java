
/**
 * @author Michael Nana Kofi Ofori
 * class for electoral officier.
 */
public class electoralOfficer extends Person{

	private int electoralOfficerID;
	private String officerPollStation;

	public electoralOfficer(String name, int age, char gender,int id, String location,int electoralOfficerID,String officerPollStation) {
		super(name, age, gender, id, location);
		this.electoralOfficerID=electoralOfficerID;
		this.officerPollStation=officerPollStation;
	}
	/**
	 * @return electoralOfficerID
	 */
	public int getelectoralOfficerID() {
		return electoralOfficerID;
	}
	/**
	 * @param electoralOfficerID
	 */
	public void setelectoralOfficerID(int electoralOfficerID) {
		this.electoralOfficerID = electoralOfficerID;
	}
	/**
	 * @return officerPollStation
	 */
	public String getofficerPollStation() {
		return officerPollStation;
	}
	/**
	 * 
	 * @param officerPollStation
	 */
		public void setofficerPollStation(String officerPollStation) {
		this.officerPollStation = officerPollStation;
	}
     

		//To String method To Prints Attritubes of a Election Officer.
		public String toString(){
		
			return "[ Electoral Officer Name:  " + getName() + " Age:  " + getAge() + " Gender:  " + getGender() + " id: " + getId()
					+ " Location: "  + getLocation() +  "Electoral Officer ID: "+ getelectoralOfficerID() +  "Electotal Officer Polling station"+getofficerPollStation()+  " ]";
			
		}
}
