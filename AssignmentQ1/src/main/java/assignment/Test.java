package assignment;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test {
  public static void main(String args[])
  {
	  
	 ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	 Address address=(Address) context.getBean("address");
	 Customer customer=(Customer) context.getBean("customer");
	 customer.displayInfo();
	 address.displayAddress();
	 //System.out.println(address);
	 //System.out.println(customer);
	  
  }
  
}