package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Student;

public class ClientTest {
        public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getCourse().getCourseName());
		context.close();
       }
}
