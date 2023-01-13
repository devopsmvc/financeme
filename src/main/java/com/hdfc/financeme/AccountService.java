package com.hdfc.financeme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository AccountRepository;
	
	
	public Account CreateAccount() {
		Account Account = generateDummyAccount();
		return AccountRepository.save(Account);
	}
	
	
	public Account generateDummyAccount() {
		return new Account(12345, "Mahesh", "Savings");
	}
	
	public Account UpdateAccount(Account Account) {
		return AccountRepository.save(Account);
	}

		

	public Account ViewAccount(int AccountID) {
		return AccountRepository.findById(AccountID).get();
	}
	
	public void  DeleteAccount(int AccountID) {
		AccountRepository.deleteById(AccountID);
	}

}
