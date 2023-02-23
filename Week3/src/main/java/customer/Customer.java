package customer;

public class Customer {



	public Customer(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	int id;
	String name;
	float balance;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}

