package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.RandomNumberGenerator;
public class TestClient {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		RandomNumberGenerator randomNumberGenerator = context.getBean("randomNumberGenerator", RandomNumberGenerator.class);
		System.out.println(randomNumberGenerator.getRandomNumber()+"\t"+randomNumberGenerator.getPi());
		context.close();
     }
}