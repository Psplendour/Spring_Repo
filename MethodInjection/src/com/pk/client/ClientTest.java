package com.pk.client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pk.model.Ticket;
import com.pk.model.TicketVendingMachine;

public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TicketVendingMachine ticketVendingMachine = context.getBean("ticketVendingMachine", TicketVendingMachine.class);
		Ticket ticket = ticketVendingMachine.generateTicket();
		
		System.out.println(ticket.printTicket());
	}
}
