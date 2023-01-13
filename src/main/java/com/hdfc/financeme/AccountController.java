package com.hdfc.financeme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	AccountService AccountService;
	
	@GetMapping("/helloworld")
	public String helloWorld() {  
		return "Hello World"; 
	}
	 
	@GetMapping("/sayhi")
	public String sayhi() {
		return "Hi from Spring Boot";
	}
	
	
	@PostMapping("/CreateAccount")
	public Account CreatePolicy() {
		
		return AccountService.CreateAccount();
	}
	
	@PutMapping("/UpdateAccount")
	public Account UpdatePolicy(@RequestBody Account Account) {
		
		return AccountService.UpdateAccount(Account);
	}

	
	@GetMapping("/ViewAccount/{AccountID}")
	public Account ViewAccountDetails(@PathVariable(value="AccountID") int AccountID) {
		return AccountService.ViewAccount(AccountID);
	}
	
	@DeleteMapping("/DeleteAccount/{AccountID}")
	public void DeleteAccountDetails(@PathVariable(value="AccountID") int AccountID) {
		AccountService.DeleteAccount(AccountID);
	}


}
