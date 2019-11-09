package com.pk.message;
public class ActiveMQMessage implements Messaging {
	@Override
	public void sendMessage()
	{
		System.out.println("Sending Message via active MQ...");
	}
}
