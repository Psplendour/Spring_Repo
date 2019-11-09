package com.pk.client;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pk.model.Employee;
public class ClientTest {
	    
	    public static void main(String[] args) {
	     ApplicationContext context = null;
	     context =new FileSystemXmlApplicationContext("E:\\Spring_WorkSpace\\SpringApplicationContextDemo\\src\\applicationContext.xml");
	    //context =new FileSystemXmlApplicationContext("E:\Spring_WorkSpace\SpringApplicationContextDemo\src\applicationContext.xml"); 
	     try {
			Employee employee = context.getBean("employee",Employee.class);
			
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName());
			
			((AbstractApplicationContext) context).close();
		} catch (BeansException e) 
		{
		e.printStackTrace();
		}
		finally
		{
			if (context !=null)
			{
				((AbstractApplicationContext) context).close();
			}
		}
	}
}
