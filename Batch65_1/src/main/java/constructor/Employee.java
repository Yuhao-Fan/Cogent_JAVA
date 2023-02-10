package constructor;

public class Employee {
	int id;
	String name;
	
	void add() {
		
	}
	
	Employee(){ //Default constructors
		System.out.println("Defaut Contructor");
	}

	public Employee(int id, String name) { //Parameterized
		super();
		this.id = id;
		this.name = name;
	}
	
	void disp() {
		
		System.out.println(id);
		System.out.println(name);
	}
	
	
	
	

}

