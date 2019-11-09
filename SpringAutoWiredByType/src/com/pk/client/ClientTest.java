package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Employee;
import com.pk.model.Pancard;
public class ClientTest {
        public static void main(String[] args) {
	    AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansbyType.xml");//Mode :byType
		Employee employee = context.getBean("employee",Employee.class);
		
		if (employee!=null)
		{
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmployeeId());
			
			Pancard pancard = context.getBean("pancard", Pancard.class);
			if(pancard !=null)
			{
				System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
			}
		}
		context.close();
		}
}
