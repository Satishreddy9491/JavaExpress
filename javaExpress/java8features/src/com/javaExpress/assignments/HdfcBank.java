package com.javaExpress.assignments;

public class HdfcBank {
	String name;
	int accountNo;
	int balance ;
	
	public HdfcBank(String name, int accountNo, int balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	
	
	@Override
	public String toString() {
		return "HdfcBank [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	
}
