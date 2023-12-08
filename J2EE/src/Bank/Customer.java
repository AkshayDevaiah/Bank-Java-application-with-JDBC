package Bank;

public class Customer {
	private String name;
	private long accno;
	private double bal;
	public Customer(String name, long accno, double bal) {
		super();
		this.name = name;
		this.accno = accno;
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public long getAccno() {
		return accno;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}

}
