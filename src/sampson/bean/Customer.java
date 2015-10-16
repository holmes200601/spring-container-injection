package sampson.bean;

import java.util.List;
import java.util.Set;

public class Customer extends Person {
	private Long id;
	private List<SalesOrder> salesOrder;
	private Set<Address> address;
	
	
	public List<SalesOrder> getSalesOrder() {
		return salesOrder;
	}
	
	public void setSalesOrder(List<SalesOrder> salesOrder) {
		this.salesOrder = salesOrder;
	}
	
	public Set<Address> getAddress() {
		return address;
	}
	
	public void setAddress(Set<Address> address) {
		this.address = address;
	}	
	
}
