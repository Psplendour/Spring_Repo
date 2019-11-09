package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.ExaminationResults;
public class TestClient {
        public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	ExaminationResults examinationResults = context.getBean("examinationResults",ExaminationResults.class);

    	System.out.println(examinationResults.getResultMessage());
    	System.out.println(examinationResults.isHasPassed());
    	context.close(); 
    	}
}
