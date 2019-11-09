package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pk.model.ATM;
public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		ATM atm = context.getBean("atm",ATM.class);
		atm.printBalanceInformation("CKEDP1633B");
		context.close();
     }
}
//The Printer has printed the balance information of the account: CKEDP1633B