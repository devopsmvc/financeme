package com.hdfc.insureme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdfc.financeme.Account;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest
class FinancemeApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Test
//	void testCreatePolicy() {
//		Policy policy = new Policy(12345, "Mahesh", 98765);
//		PolicyService pService = new PolicyService();
//		assertEquals(policy.getPolicyID(), pService.generateDummyPolicy().getPolicyID());
//	}
//	
//	@Test
//	void testCreateAccount() {
//		RestAssured.baseURI="http://65.2.123.255:8090/CreateAccount";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response response =httpRequest.request(Method.POST);
//		System.out.println(response.getStatusCode());
//		assertEquals(response.statusCode(), 200);
//				
//	}
//
//	@Test
//	void testGetAccountDetails() {
//		RestAssured.baseURI="http://65.2.123.255:8090/ViewAccount";
//		RequestSpecification httpRequest = RestAssured.given();
//		Response response =httpRequest.request(Method.GET,"/12345");
//		System.out.println(response.getStatusCode());
//		assertEquals(response.statusCode(), 200);
//				
//	}
//	
//	@Test
//	void testUpdateAccountDetails() {
//		RestAssured.baseURI="http://13.127.141.134:8090/UpdateAccount";
//		RequestSpecification httpRequest = RestAssured.given();
//		httpRequest.contentType(ContentType.JSON);
//	    httpRequest.body(new Account(33, "Vikul", "Savings"));
//		Response response =httpRequest.put("10");
//		System.out.println(response.getStatusCode());
//		assertEquals(response.statusCode(), 200);
//				
//	}
//
}
