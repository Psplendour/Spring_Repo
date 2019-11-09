package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Employee;
import com.pk.model.Pancard;
public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
		System.out.println("-----------------------------");
		
		Pancard pancard = employee.getPancard();
		if(pancard !=null)
		{
			System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		}else
		{
			System.out.println("pan card detail is not present");
		}
		context.close();
		}
}
