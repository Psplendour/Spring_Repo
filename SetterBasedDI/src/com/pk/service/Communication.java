package com.pk.service;
import com.pk.message.Messaging;
public class Communication {
	
private Messaging message;
   
public void setMessage(Messaging message) 
	{
		this.message = message;
	}
   
	public void communicate()
	{
		message.sendMessage();
	}
}
