package uygulama2;

public class Teacher extends Person{
	
	private String branch;
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, String surname, int birthyear) {
		super(name, surname, birthyear);
	}
	public Teacher(String name, String surname, int birthyear, String branch) {
		super(name, surname, birthyear);
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Teacher [branch=" + branch + ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ ", getBirthyear()=" + getBirthyear() + "]";
	}

}
