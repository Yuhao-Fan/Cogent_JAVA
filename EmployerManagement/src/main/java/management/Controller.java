package management;

import java.sql.SQLException;

public class Controller {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BusinessMethods bm= new BusinessMethods();
		bm.readEmp();
		bm.addEmp();
		bm.updateEmp();
		bm.deleteEmp();
		bm.readEmp();
		System.out.println("success");
	}

}
