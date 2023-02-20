package systematic;

import java.sql.SQLException;

public class ControllerMain {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		MethodsDef bl= new MethodsDef();
		bl.readData();
		bl.createData();
		bl.updateData();
		bl.deleteData();
		bl.readData();
		System.out.println("success");

	}

}
