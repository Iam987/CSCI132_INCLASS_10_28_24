
public class Patient implements Comparable<Patient>{
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
	@Override
	public int compareTo(Patient o) {
		if(age < o.age) {
			return 1;
		}
		else if(age > o.age) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return name + " | age: " + age;
	}
}
