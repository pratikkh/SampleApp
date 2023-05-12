package com.miit.java.april;

public class ATM {

	
	void withdrawMoney(Account ca, int withdrawnAmount) {
		
		ca.balance = ca.balance - withdrawnAmount;
	}
	
}
