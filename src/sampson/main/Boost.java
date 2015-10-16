package sampson.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import sampson.bean.Customer;

public class Boost {
	public static void main(String[] args) {
		// Initialize spring container
		FileSystemXmlApplicationContext ctx = null;
		try {
			ctx = new FileSystemXmlApplicationContext("Bean.xml");
			
			Customer cs = (Customer) ctx.getBean("customer");
			
			System.out.printf("***Bean name of customer: %1$s***\n", cs.getBeanName());
			
			System.out.printf("***Context %1$s***\n", cs.getContext().toString());
			
			System.out.printf("***Customer %1$s spends %2$s***\n", cs.getName(), cs.spendTotal());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ctx.close();
		}
	}
}
