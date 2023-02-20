package myexception;

public class AgeException extends Exception{
	
		public AgeException(String msg) {
			super(msg);
			System.out.println("MyException created");
			// TODO Auto-generated constructor stub
		}
}
