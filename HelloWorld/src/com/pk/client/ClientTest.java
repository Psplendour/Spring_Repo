package com.pk.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pk.model.Message;
public class ClientTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory beanfactory= new XmlBeanFactory(resource);
		
	Object object = beanfactory.getBean("message");
		
		if(object !=null)
		{
			Message message=(Message)object;
			System.out.println(message.getMessageId()+"\t"+message.getMessage());
		}
		
		System.out.println("-----------------------------------");
		
		Message message =beanfactory.getBean("message",Message.class);
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		System.out.println("-----------------------------------");
		
		String[] aliases = beanfactory.getAliases("message");
		
		for(String al:aliases)
		{
			System.out.println(al);
		}
		
		System.out.println("-----------------------------------");
        
		Message message1 =beanfactory.getBean(Message.class);
		System.out.println(message1.getMessageId()+"\t"+message1.getMessage());
		
		System.out.println("-----------------------------------");
		Class<?> cls = beanfactory.getType("message");
		System.out.println(cls.getName());
		
	}
}
