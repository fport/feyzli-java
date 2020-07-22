package uygulama2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student("Furkan", "Portakal", 1999, "13123", null);
		Teacher teacher1 = new Teacher("Ferhat", "Aykan", 1995, null);
		Doctor doctor1 = new Doctor("Faruk", "Yildiz", 1980, "Heart");
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(student1);
		people.add(teacher1);
		people.add(doctor1);
		
		ArrayList<String> lessons = new ArrayList<String>();
		
		lessons.add("Math");
		lessons.add("Physics");
		student1.setLesson(lessons);
		showInfoStudent(student1);
		
	
	}
	public static void showInfoPerson(Person person){
		System.out.println("Name : "+person.getName());
		System.out.println("Surname : "+person.getSurname());
		System.out.println("Birthyear : "+person.getBirthyear());
	}
	public static void showInfoStudent(Student student){
		System.out.println("Name : "+student.getName());
		System.out.println("Surname : "+student.getSurname());
		System.out.println("Birthyear : "+student.getBirthyear());
		System.out.println("School number : "+student.getSchoolNumber());
		System.out.println("Lesson : "+student.getLesson());
	}
	public static void showInfoTeacher(Teacher teacher) {
		System.out.println(teacher);
	}
	public static void showInfoDoctor(Doctor doctor) {
		System.out.println(doctor);
	}
}


