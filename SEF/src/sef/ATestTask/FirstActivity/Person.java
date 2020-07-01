package sef.ATestTask.FirstActivity;


public class Person {

private String firstName;
private String secondName;
private int age;

//TODO 1 Implement Person Attributes

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
		
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.matches("[a-zA-Z]+"))
		{
			throw new CustomizedException();
		}
		this.firstName = firstName;
	}


	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		if (!secondName.matches("[a-zA-Z]+"))
		{
			throw new CustomizedException();
		}

//		this.firstName = firstName;
		this.secondName = secondName;
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName();
	}
		
	public String introduce() {
			return "My name is " + getFirstName() + " and i am " + getAge() + " years old";
		}

	
	}
	




