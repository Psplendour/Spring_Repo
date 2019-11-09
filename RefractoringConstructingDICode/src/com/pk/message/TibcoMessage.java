package com.pk.message;
public class TibcoMessage implements Messaging {
	@Override
	public void sendMessage()
	{
		System.out.println("Sending Message via Tibco MQ...");
	}
}
