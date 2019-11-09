package com.pk.message;
public class ActiveMQMessage implements Messaging {
	
	/* (non-Javadoc)
	 * @see com.pk.message.Messaging#sendMessage()
	 */
	@Override
	public void sendMessage()
	{
		System.out.println("Sending Message via active MQ1...");
	}

}
