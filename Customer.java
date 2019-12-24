package oops;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;

	public Customer() {
		customerId=1001; customerName= "NA"; customerAddress= "NA"; billAmount= 500;
		System.out.println("Customer Constructor called");
	}

	public Customer(int customerId, String customerName, String customerAddress, int billamount) {
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billamount;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	public void print() {
		System.out.println("CustomerId = "+customerId);
		System.out.println("CustomerName = "+customerName);
		System.out.println("CustomerAddress = "+customerAddress);
		System.out.println("billamount = "+billAmount);
	}
	
	public static void main(String[] args) {
		Customer customer1=  new Customer();
		customer1.print();
		System.out.println(""
				+ "");
		Customer customer2= new Customer(1002,"Ram","Pune",600);
		customer2.print();
		System.out.println(""
				+ "");
		customer2.setBillAmount(1000);
		customer2.setCustomerAddress("Goa");
		customer2.print();
	}
}
