package com.pk.client;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.info.CompanyInfo;
import com.pk.model.Student;

public class client {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		CompanyInfo companyInfo = context.getBean("companyInfo", CompanyInfo.class);
		
		Map<Integer, String> empIdAndNameMap = companyInfo.getEmpIdAndNameMap();
		Set<Entry<Integer, String>> s1 = empIdAndNameMap.entrySet();
		for (Entry<Integer, String> entry : s1) 
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("--------------------------------------------------");
		
		Map<Integer, Student> studentIdMap = companyInfo.getStudentIdMap();
		Set<Entry<Integer, Student>> s2 = studentIdMap.entrySet();
		for (Entry<Integer, Student> entry1 : s2) {
			System.out.println(entry1.getKey());
			Student student = entry1.getValue();
			System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getEmail());
			}
		context.close();
	}
}
