package uygulama2;

public class Doctor extends Person{

	private String departman;
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	public Doctor(String name, String surname, int birthyear, String departman) {
		super(name, surname, birthyear);
		this.departman = departman;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	@Override
	public String toString() {
		return "Doctor [departman=" + departman + ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ ", getBirthyear()=" + getBirthyear() + "]";
	}
	
	
	
}
