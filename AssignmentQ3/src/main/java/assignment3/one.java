package assignment3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  


public class one
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("configxml.xml");  
        ActBankC obj=(ActBankC)applicationcontext.getBean("mn");  
        obj.withdraw();     
        }
}