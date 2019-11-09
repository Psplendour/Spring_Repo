package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.EmailValidator;
public class TestClient {
     public static void main(String[] args) {
	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
     EmailValidator emailValidator = context.getBean("emailValidator",EmailValidator.class);
     
     System.out.println(emailValidator.getisValidEmail());
     context.close();

	}

}
