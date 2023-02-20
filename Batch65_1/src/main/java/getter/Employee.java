package getter;

public class Employee {
	int id;
	String nameString;
	float salary;
	public Employee(int id, String nameString, float salary) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameString=" + nameString + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
