package com.pk.service;
import com.pk.message.ActiveMQMessage;
public class Communication {
	
	private ActiveMQMessage activeMQMessage;

	public Communication(ActiveMQMessage activeMQMessage)
	{
		this.activeMQMessage = activeMQMessage;
	}
	
	public void communicate()
	{
		activeMQMessage.sendMessage();
	}
}
