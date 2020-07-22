package uygulama2;

import java.util.ArrayList;

public class Student extends Person{

	private  String schoolNumber;
	private ArrayList<String> lesson;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String surname, int birthyear) {
		super(name, surname, birthyear);
	}

	public Student(String name, String surname, int birthyear, String schoolNumber, ArrayList<String> lesson) {
		super(name, surname, birthyear);
		this.schoolNumber = schoolNumber;
		this.lesson = lesson;
	}

	public String getSchoolNumber() {
		return schoolNumber;
	}

	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}

	public ArrayList<String> getLesson() {
		return lesson;
	}

	public void setLesson(ArrayList<String> lesson) {
		this.lesson = lesson;
	}

	@Override
	public String toString() {
		return "Student [schoolNumber=" + schoolNumber + ", lesson=" + lesson + ", getName()=" + getName()
				+ ", getSurname()=" + getSurname() + ", getBirthyear()=" + getBirthyear() + "]";
	}
	
	
}
