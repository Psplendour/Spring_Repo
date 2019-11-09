package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Employee;
import com.pk.model.Person;

public class ClientTest {

public static void main(String[] args) {
 AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
 Employee employee = context.getBean("employee", Employee.class);
 System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getGender()+"\t"+employee.getPanNo());
		
 Person person = context.getBean("person",Person.class);
 System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getGender());
      }
}
