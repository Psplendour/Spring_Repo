package com.pk.client;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.pk.model.Message;
public class ClientTest1 {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory beanfactory= new XmlBeanFactory(resource);
		
		Object object = beanfactory.getBean("message");
		
		if(object !=null)
		{
			Message message=(Message)object;
			System.out.println(message.getMessageId()+"\t"+message.getMessage());
		}
    }
}
