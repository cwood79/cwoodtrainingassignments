package beans;

import java.util.LinkedList;

import exceptions.InsufficientBalanceException;
import exceptions.InsufficientOpeningBalanceException;
import exceptions.InvalidAccountNumberException;

public class ICICIBank {
	
	
	LinkedList<Account> accounts=new LinkedList<>();
	
	
	public String createAccount(int accountNumber,int amount) throws InsufficientOpeningBalanceException
	{
		if(amount<500)
		{
			throw new InsufficientOpeningBalanceException();
		}
		
		Account account = new Account(accountNumber,amount);
		
		accounts.add(account);
		
		return "account created successfully";
	}
	
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
		
	}
	
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);
		
		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount()-amount);
			return account.getAmount();
		}
		
		throw new InsufficientBalanceException();
	}
	
	
	public int depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException
	{
		Account account=searchAccount(accountNumber);
		account.setAmount(account.getAmount()+amount);
		return account.getAmount();
		
	}
	
	public String transferAmount(int fromAccount, int toAccount, int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account acct1=searchAccount(fromAccount);
		Account acct2=searchAccount(toAccount);
		
		withdrawAmount(fromAccount, amount);
		depositAmount(toAccount, amount);
		
		return "New balance acct1: "+acct1.getAmount()+ "New balance acct2: "+acct2.getAmount();
		
	}


}