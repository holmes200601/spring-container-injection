package sampson.bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import sampson.enumeration.Gender;

public class Customer extends Person implements BeanNameAware{
	private Long id;
	private String beanName;
	@Autowired
	private ApplicationContext ctx;
	private List<SalesOrder> salesOrder;
	private Set<Address> address;
	
	public Customer(String name, String phone, Integer age, Gender gender, 
					Long id, Set<Address> ads, List<SalesOrder> ods) {
		super(name, phone, age, gender);
		
		this.setId(id);
		this.setAddress(ads);
		this.setSalesOrder(ods);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	public BigDecimal spendTotal() {
		BigDecimal result = BigDecimal.ZERO;
		
		for (SalesOrder order : this.getSalesOrder()) {
			result = result.add(order.orderTotal());
		}
		
		return result;
	}

	public void setBeanName(String name) {
		this.beanName = name;		
	}
	
	public String getBeanName() {
		return this.beanName;
	}

	public ApplicationContext getContext() {
		return this.ctx;
	}
	
}
