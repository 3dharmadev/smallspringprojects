package Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
	      ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	     /* Tourist t=ctx.getBean(Tourist.class,"t");
	      
	      System.out.println(t); */
	      
	             HolidayPackage h1= ctx.getBean(HolidayPackage.class,"h");
	         
	             h1.showDetails();
	      
	}
}
