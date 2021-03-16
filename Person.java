

/**
 * @author Michael Nana Kofi Ofori
 *Lab 4
 */
public class Person {

	
	//Instance Variables
	private String name;
	private int age;
	private char gender;
	private int id;
	private String location;
	/**
	 * COnstructors
	 */
	public Person(String name, int age, char gender, int id, String location) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.id=id;
		this.location=location;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
    //To String method
    public String toString(){
		return "[ Name:  "  +name+ " Age:  " +age+ " Gender:  "+gender+ " id: "+id+" Location: "+location+ " ]";
		
    
	}

}
