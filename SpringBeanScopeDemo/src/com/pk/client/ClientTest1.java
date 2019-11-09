package com.pk.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.model.Message;

public class ClientTest1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message message = context.getBean("message", Message.class);
		
		message.setMessageId(1000);
		message.setMessage("Hello");
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		Message message1 = context.getBean("message", Message.class);
		System.out.println(message1.getMessageId()+"\t"+message1.getMessage());
		
		((AbstractApplicationContext) context).close();
		}
}
