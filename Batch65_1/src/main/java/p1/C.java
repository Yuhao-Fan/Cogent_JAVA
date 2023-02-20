package p1;

class C {
	public static void main(String[] args) {
		B b = new B();
		b.call_display();
//		b.display();
		b.protected_display();
		A a = new A();
		a.protected_display();
//		a.display();
	}
}
