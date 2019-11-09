package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Employee;

public class ClientTest {
public static void main(String[] args) {
 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
 Employee employee = context.getBean("employee", Employee.class);
 System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNo());
     }
}
