package products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
	public Controller() {
		super();
		this.products = new ArrayList<>();
	}
	ArrayList<Product> products;
	public void getProducts() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn = ConnectDB.connectSetup();
		PreparedStatement pstmt=conn.prepareStatement("select * from product");  
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			Product p = new Product(rs.getInt("id"),rs.getString("name"),rs.getFloat("cost"),
					rs.getFloat("discount"),rs.getInt("available"),rs.getInt("sold"));
			System.out.println(p);
			products.add(p);
		}
		conn.close();
		System.out.println("Records are now in Collection");
		System.out.println(products);
		System.out.println(":::::::::::::::::::");
//		products.stream().forEach(System.out::println);
		
	}
	public void getByDiscount(float discount) {
		System.out.println("getByDiscount: "+discount);
		products.stream().filter(p->p.discount==discount).forEach(System.out::println);
		
	}
	public void getBySold(int sold) {
		System.out.println("getBySold: "+sold);
		products.stream().filter(p->p.sold==sold).forEach(System.out::println);
		
	}
	public void getByCost(float cost) {
		System.out.println("getByCost"+cost);
		products.stream().filter(p->p.cost==cost).forEach(System.out::println);
		
	}
	public void bonus() {
		System.out.println("bonus");
		products.stream().filter(p->p.sold>=10).forEach(p->
				{
					p.discount+=0.1f;
					System.out.println(p);
				});

		
	}
	
}
