package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.PerimeterCalculator;
public class ClientTest {
        public static void main(String[] args) {
		AbstractApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml");
	    PerimeterCalculator perimeterCalculator = context.getBean("perimeterCalculator", PerimeterCalculator.class);
	    
	    System.out.println(perimeterCalculator.getPerimeter());
	    context.close();
        }
}
