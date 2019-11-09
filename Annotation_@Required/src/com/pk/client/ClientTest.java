package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Message;
public class ClientTest {
        public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Message message = context.getBean("message", Message.class);
		
		System.out.println(message.getMessageID()+"\t"+ message.getMessage());
		context.close();
		}
}
