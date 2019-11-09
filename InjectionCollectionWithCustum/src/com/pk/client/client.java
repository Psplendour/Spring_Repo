package com.pk.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.info.OrgInfo;
import com.pk.model.Student;

public class client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		OrgInfo orgInfo = context.getBean("orgInfo",OrgInfo.class);
		
	    Student[] stuArr = orgInfo.getStuArr();
		for (Student stu : stuArr) 
		{
			System.out.println(stu.getStudentId()+"\t"+stu.getStudentName()+"\t"+stu.getEmail()+"\t"+stu.getGender());
		}
		System.out.println("---------------------------------------------------------");
		
		List<Student> studLsit = orgInfo.getStudLsit();
		for (Student stu : studLsit) 
		{
			System.out.println(stu.getStudentId()+"\t"+stu.getStudentName()+"\t"+stu.getEmail()+"\t"+stu.getGender());
		}
		System.out.println("---------------------------------------------------------");
		
		Set<Student> stuSet = orgInfo.getStuSet();
		for (Student stu : stuSet) {
			{
				System.out.println(stu.getStudentId()+"\t"+stu.getStudentName()+"\t"+stu.getEmail()+"\t"+stu.getGender());
			}
		}
		context.close();
}
}
