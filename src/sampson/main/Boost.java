package sampson.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sampson.bean.Customer;

public class Boost {
	public static void main(String[] args) {
		// Initialize spring container
		ApplicationContext ctx = new FileSystemXmlApplicationContext("Bean.xml");
		
		Customer cs = (Customer) ctx.getBean("customer");
		
		System.out.print(cs.getName());
	}
}
