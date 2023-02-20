package getter;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRTeam hrTeam=new HRTeam();
		Employee employee1 =  new Employee(0, "a", 60000.0f);
		hrTeam.add(employee1);
		Employee employee2 =  new Employee(0, "a", 70000.0f);
		hrTeam.add(employee2);
		Employee employee3 =  new Employee(0, "a", 60000.0f);
		hrTeam.add(employee3);
		Employee employee4 =  new Employee(0, "a", 50000.0f);
		hrTeam.add(employee4);
		Employee employee5 =  new Employee(0, "a", 40000.0f);
		hrTeam.add(employee5);
	}

}
