package accessModifiers;

public class Motor {
	
	private void disp() {
		System.out.println("I got hidden info ..restricted from out side ");
		
	}
	
	public void show() {
		System.out.println("No restriction Across Application and Packages");
		disp(); // from same Class Private Members can be access
	}

}

