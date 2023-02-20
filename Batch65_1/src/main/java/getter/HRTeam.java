package getter;

import java.util.ArrayList;

public class HRTeam {
	ArrayList<Employee> list;
	public HRTeam() {
		// TODO Auto-generated constructor stub
		this.list = new ArrayList<Employee>();
	}
	public void add(Employee e) {
		if(e.getSalary()>=50000.0) {
			System.out.println("bonus");
		}
		this.list.add(e);
		System.out.println(e);
		
	}

}
