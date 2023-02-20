package Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DrawShapes d=new Circle();
//        Runner r=new Runner();
//        r.setShapes(d);
//        r.shape();

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

                   Runner r1=  ctx.getBean(Runner.class,"loose_bean");
                          r1.shape();
    }
}
