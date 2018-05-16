package com.qa.service;



import org.junit.Assert;
import org.junit.Test;

import com.qa.domain.Account;



public class AccountServiceTest {

	@Test
	public void test() {
		Account johnAccount = new Account("john", "gordon", "1234");
		AccountService service = new AccountService();
		Assert.assertEquals(0, service.getAccountMap().size());
		service.addAccount(johnAccount);
		Assert.assertEquals(1, service.getAccountMap().size());
		service.removeAccount(1);
		Assert.assertEquals(0, service.getAccountMap().size());
	}

}
