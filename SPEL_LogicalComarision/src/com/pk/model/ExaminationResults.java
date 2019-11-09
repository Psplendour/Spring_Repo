package com.pk.model;
public class ExaminationResults {
            private boolean hasPassed;
            private String resultMessage;
            
			public boolean isHasPassed() {
				return hasPassed;
			}
			public void setHasPassed(boolean hasPassed) {
				this.hasPassed = hasPassed;
			}
			public String getResultMessage() {
				return resultMessage;
			}
			public void setResultMessage(String resultMessage) {
				this.resultMessage = resultMessage;
			}
}
