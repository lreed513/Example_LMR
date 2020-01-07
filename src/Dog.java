
/**
 * This class models a Dog
 * @author lreed
 *
 */
public class Dog {

	//Instance fields
	private String name;
	private int age;
	
	//constructors
	public Dog() {
		name = "null";
		age = 0;
	}//end empty-argument constructor
	
	/**
	 * This is the preferred constructor
	 * @param name
	 * @param age
	 */
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}//end preferred constructor
	
	//Getters/Setters/toString
	/**
	 * This method returns a string that represents a dog's bark
	 * @return
	 */
	public String bark() {
		return "Bark, bark bark!!";
	}//end bark
	
	public String getName() {
		return name;
	}//end getName
	public void setName(String name) {
		this.name = name;
	}//endsetName
	public int getAge() {
		return age;
	}//end getAge
	public void setAge(int age) {
		this.age = age;
	}//end setAge


	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}//end toString
	
	
	
	
}//end class
