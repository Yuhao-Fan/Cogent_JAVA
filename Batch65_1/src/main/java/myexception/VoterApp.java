package myexception;

public class VoterApp {
	public void checkAge(int age) throws AgeException {
		// TODO Auto-generated method stub
		if(age<18) {
			throw new AgeException("Age is too small");
		}
		
	}

}
