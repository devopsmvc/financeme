package com.hdfc.financeme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AccountID;	
	private String AccountName;	
	private String AccountType;
	
	
	//Private //public //protected //default
	
	public Account() {
		
	}
	
	public Account(int AccountID, String AccountName, String AccountType) {
		
		this.AccountID=AccountID;
		this.AccountName=AccountName;
		this.AccountType=AccountType;
	}

	public int getPolicyID() { 
		return AccountID;
	}

	public void setPolicyID(int AccountID) {
		this.AccountID = AccountID;
	}

	public String getPolicyName() {
		return AccountName;
	}

	public void setPolicyName(String AccountName) {
		this.AccountName = AccountName;
	}

	public String getPolicyNumber() {
		return AccountType;
	}

	public void setPolicyNumber(String AccountType) {
		this.AccountType = AccountType;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;
	}
		
}
