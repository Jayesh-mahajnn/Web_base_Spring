package example.spring.core;

public class Customer {
	
	private String name;
	private String email;
	private Address commAddress;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String email, Address commAddress) {
		super();
		this.name = name;
		this.email = email;
		this.commAddress = commAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getCommAddress() {
		return commAddress;
	}

	public void setCommAddress(Address commAddress) {
		this.commAddress = commAddress;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", commAddress=" + commAddress + "]";
	}
	
	
	

}
