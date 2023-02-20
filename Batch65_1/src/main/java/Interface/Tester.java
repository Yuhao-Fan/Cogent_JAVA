package Interface;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process p = new Process();
		p.add();
//		p.show();
		//p.companyID=700; //final cant be modified...
		System.out.println(p.companyID);
		Employee.show(); //ststic methods
		System.out.println(Employee.companyID);
//		Employee.add();
//		Payroll.payrollcalt();
	}

}
