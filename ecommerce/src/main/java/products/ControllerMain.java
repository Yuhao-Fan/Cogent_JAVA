package products;

import java.sql.SQLException;


public class ControllerMain {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		controller.getProducts();
		controller.getByCost(100.00f);
		controller.getByDiscount(0.1f);
		controller.getBySold(66);
		controller.bonus();
		

	}

}
