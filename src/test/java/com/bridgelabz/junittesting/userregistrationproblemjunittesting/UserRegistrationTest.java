package com.bridgelabz.junittesting.userregistrationproblemjunittesting;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest{
     
	boolean result;
	UserRegistrationProblem userTest = new UserRegistrationProblem();
	
	@Test
	public void firstName_IsValid_PassTest() {
		result = userTest.isValidUserFirstName("Neeta");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void firstName_IsValid_FailTest() {
		result = userTest.isValidUserFirstName("Mourya");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastName_IsValid_PassTest() {
		result = userTest.isValidUserLastName("Mourya");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void lastName_IsValid_FailTest() {
		result = userTest.isValidUserLastName("Mourya");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void Email_IsValid_PassTest() {
		result = userTest.isValidUserEmail("abc.100@yahoo.com");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void Email_IsValid_FailTest() {
		result = userTest.isValidUserEmail("abc1236");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNumber_isValidMobileNo() {
		result = userTest.isValidMobileNo("91 8955655668");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void mobileNumber_IsValid_FailTest() {
		result = userTest.isValidMobileNo("89556556685665");
		Assert.assertEquals(true,result);
	}
	
	@Test
	public void password_IsValid_PassTest() {
		result = userTest.isValidPassword("jnfdmdfb@#A");
		Assert.assertEquals(true,result);
	}
	@Test
	public void password_IsValid_FailTest() {
		result = userTest.isValidPassword("jdfjdhj-.");
		Assert.assertEquals(true,result);
	}
	
	
}	