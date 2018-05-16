package com.qa.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.domain.Account;



public class AccountService {
	
	private Map<Integer, Account> accountMap = new HashMap<Integer, Account>();
	private static int count = 1; 
	
	public AccountService(){}
	
	public void addAccount(Account accountToAdd)
	{
		accountMap.put(count, accountToAdd);
		count++;
	}
	
	public void removeAccount(Integer keyToRemove)
	{
		accountMap.remove(keyToRemove);
	}

	public Map<Integer, Account> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(Map<Integer, Account> accountMap) {
		this.accountMap = accountMap;
	}
}
