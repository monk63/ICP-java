
/**
 * @author Michael Nana Kofi Ofori
 * Class for election candidate
 */
public class candidate extends Person {
	private int candidateNum;
	private int votes;
	private String Party;
	public candidate(String name, int age, char gender,int id, String location,int candidateNum,int votes,String Party) {
		super(name, age, gender,id, location);
		// TODO Auto-generated constructor stub
		this.candidateNum=candidateNum;
		this.votes=votes;
		this.Party = Party;
	}
/**
 * @return getcandidateNu
 */
public int getcandidateNum() {
	return candidateNum;
}
/**
 * @param candidateNum
 */
public void setCandidateNum(int candidateNum) {
	this.candidateNum = candidateNum;
}
/**
 * @return votes
 */
public int getvotes() {
	return votes;
}
/**
 * @param votes
 */
public void votes(int votes) {
	this.votes = votes;
}
/**
 * @return votes
 */
public String getParty() {
	return Party;
}
/**
 * @param votes
 */
public void Party(String Party) {
	this.Party = Party;
}
//To String method To Prints Attritubes of a Election Candidate.
public String toString(){
		
	return "[ Candidate Name:  " + getName() + " Age:  " + getAge() + " Gender:  " + getGender() + " id: " + getId()
			+ " Location: "  + getLocation() + " Political Party: "+getParty()  + " Candidate Number: "+ getcandidateNum() + " Vote Count: "+ getvotes()+ "  ]";
	
}
}
