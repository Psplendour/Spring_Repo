package com.pk.model;
import org.springframework.beans.factory.annotation.Required;
public class Message {
           private int messageID;
           private String message;
		
        public int getMessageID() {
			return messageID;
		}
        @Required
		public void setMessageID(int messageID) {
			this.messageID = messageID;
		}
		public String getMessage() {
			return message;
		}
		@Required
		public void setMessage(String message) {
			this.message = message;
		}
}
