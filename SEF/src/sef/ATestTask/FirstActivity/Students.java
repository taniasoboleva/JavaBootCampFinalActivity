package sef.ATestTask.FirstActivity;


public class Students {

private String schoolName;


public Students(){
	this.schoolName="Unknown";
		}

public String getSchoolName() {
	return schoolName;
}

public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}

public String introduce() {
	return " I am study in university " + getSchoolName();
}
}

