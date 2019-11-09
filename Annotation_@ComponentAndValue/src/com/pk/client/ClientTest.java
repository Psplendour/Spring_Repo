package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.model.UserDetails;
public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	    UserDetails userDetails = context.getBean("userDetails",UserDetails.class);
	    
	    System.out.println(userDetails.getUserName()+"\t"+userDetails.getPassword());
	    context.close();
		}
}
