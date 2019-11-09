package com.pk.client;
import java.util.List;
import java.util.Set;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.info.OrgInfo;
public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	   OrgInfo orgInfo = context.getBean("orgInfo", OrgInfo.class);
		 
	   String[] namesArray = orgInfo.getNamesArray();
	   for (String name : namesArray) 
	   {
		   System.out.println(name);
	   }
	   System.out.println("-------------------------------------------------");
	   
	   List<String> empNameList = orgInfo.getEmpNameList();
	   for (String EmpName : empNameList)
	   {
		System.out.println(EmpName);
	   }
	   System.out.println("-------------------------------------------------");
	   
	   Set<Integer> empIdsSet = orgInfo.getEmpIdsSet();
	   for (Integer ID : empIdsSet) 
	   {
		System.out.println(ID);
	   }
	   context.close();
	}
}


