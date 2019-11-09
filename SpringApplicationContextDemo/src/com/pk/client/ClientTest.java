package com.pk.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Employee;

public class ClientTest {

	    public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		
		((AbstractApplicationContext) context).close();
}
}
