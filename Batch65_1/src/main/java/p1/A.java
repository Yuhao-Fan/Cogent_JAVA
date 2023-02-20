package p1;
  
// Class A
public class A {
	private void display()
    {
        System.out.println("private_display");
    }
	public void call_display() {
		display();
	}
	protected void protected_display() {
		System.out.println("protected_display");
	}
}