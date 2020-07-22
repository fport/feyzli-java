package uygulama2;

public class Person {
	private String name;
	private String surname;
	private int birthyear;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String surname, int birthyear) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthyear = birthyear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", birthyear=" + birthyear + "]";
	}
	
	
}
