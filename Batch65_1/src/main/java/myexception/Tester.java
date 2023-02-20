package myexception;

public class Tester {

	public static void main(String[] args)  throws AgeException {
		// TODO Auto-generated method stub
		VoterApp v = new VoterApp();
		v.checkAge(18);
		v.checkAge(0);
	}

}
