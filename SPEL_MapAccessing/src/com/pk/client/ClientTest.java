package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.TelephoneDirectoryAccessor;
public class ClientTest {
        public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TelephoneDirectoryAccessor telephoneDirectoryAccessor = context.getBean("telephoneDirectoryAccessor",TelephoneDirectoryAccessor.class);
        Integer telephonenumber = telephoneDirectoryAccessor.getTelephonenumber();
        System.out.println(telephonenumber);
        context.close();
        }
}
