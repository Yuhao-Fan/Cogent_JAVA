package lambda;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perimeter p = (c, d) -> {
			System.out.println("lambda");
			System.out.println(c);
			System.out.println(d);
		};
		p.parameter2(1, 2);
		new Perimeter(){

			@Override
			public void parameter2(int a, int b) {
				// TODO Auto-generated method stub
				
			}}.show();

		}

}
