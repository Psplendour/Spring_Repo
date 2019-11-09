package com.pk.model;
public class ATM {
	private Printer printer;
    public Printer getPrinter() {
		return printer;
	}
    public void setPrinter(Printer printer) {
		this.printer = printer;
	}
    public void printBalanceInformation(String accountNumber) 
    {
    	getPrinter().printerBalanceInformation(accountNumber);
	}
}
