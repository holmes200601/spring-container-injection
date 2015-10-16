package sampson.bean;

import java.math.BigDecimal;
import java.util.Map;

public class SalesOrder {
	private Long id;
	private Customer customer;
	private Map<Product, BigDecimal> saledProduct;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<Product, BigDecimal> getSaledProduct() {
		return saledProduct;
	}
	public void setSaledProduct(Map<Product, BigDecimal> saledProduct) {
		this.saledProduct = saledProduct;
	}	
	
}
