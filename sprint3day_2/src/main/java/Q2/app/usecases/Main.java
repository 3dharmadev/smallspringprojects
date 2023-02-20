package Q2.app.usecases;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		      Demo demo=ctx.getBean(Demo.class);
		      
		      demo.showDetails();
		      
		      ((AbstractApplicationContext) ctx).close();
		
	}
}
