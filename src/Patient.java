
public class Patient {
	private String name;
	private int age;
	
	public Patient(String n, int a) {
		name = n;
		age = a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
}
