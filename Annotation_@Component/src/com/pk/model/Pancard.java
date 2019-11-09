package com.pk.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //Pancard pancard = new Pancard();
public class Pancard {
	@Value("#{employee.employeeName}")
	private String panHolderName;

	@Value("NHKIY2354Y")
	private String panNo;

	public String getPanHolderName() {
		return panHolderName;
	}

	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
}
