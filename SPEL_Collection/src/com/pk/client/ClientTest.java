package com.pk.client;
import java.util.List;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.Student;
import com.pk.model.StudentListAccessor;
public class ClientTest {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		StudentListAccessor studentListAccessor = context.getBean(
				"studentListAccessor", StudentListAccessor.class);

		Student student = studentListAccessor.getThirdStudentInList();
		System.out.println(student.getName() + student.getMarks());

		System.out.println("List of failed Student:");
		List<Student> failedStudent = studentListAccessor.getFailedStudent();

		for (Student student1 : failedStudent) {
			System.out.println(student1.getName() + "\t" + student1.getMarks());
		}
		System.out.println("List Of all Student Name:");

		List<String> studentName = studentListAccessor.getStudentName();

		for (String StuName : studentName) {
			System.out.println(StuName);
		}
		context.close();
	}
}
