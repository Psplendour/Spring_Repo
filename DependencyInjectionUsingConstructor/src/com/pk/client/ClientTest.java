package com.pk.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.service.Communication;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		
		Communication communication = context.getBean("communication",Communication.class);
		
		communication.communicate();
		((AbstractApplicationContext) context).close();
}
}
