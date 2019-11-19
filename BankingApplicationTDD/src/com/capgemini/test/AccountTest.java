package com.capgemini.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exceptions.InsufficientBalanceException;
import com.capgemini.exceptions.InsufficientInitialAmountException;
import com.capgemini.exceptions.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
public class AccountTest {

	AccountService accountService;
	
	@Mock
	AccountRepository accountRepository;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		accountService = new AccountServiceImpl(accountRepository);
	}

	/*
	 * create account
	 * 1.when the amount is less than 500 then system should throw exception
	 * 2.when the valid info is passed account should be created successfully
	 */
	
	@Test(expected=com.capgemini.exceptions.InsufficientInitialAmountException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InsufficientInitialAmountException
	{
		accountService.createAccount(101, 400);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAccountShouldBeCreatedSuccessfully() throws InsufficientInitialAmountException
	{
		Account account =new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepository.save(account)).thenReturn(true);
		assertEquals(account, accountService.createAccount(101, 5000));
	}
	
	/*
	 * deposit amount
	 * 1.when the account number is invalid, system should throw exception
	 * 2.when the valid info is passed, amount should be successfully updated
	 */
	
	@Test(expected=com.capgemini.exceptions.InvalidAccountNumberException.class)
	public void whenTheDepositInfoisInvalidSystemShouldThrowException() throws InvalidAccountNumberException
	{
		accountService.depositAmount(101, 400);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAmountShouldBeDepositedSuccessfully1() throws InvalidAccountNumberException
	{
		Account account =new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepository.searchAccount(101)).thenReturn(account);
		assertEquals(5500, accountService.depositAmount(101, 500));
	}
	
	/*
	 * withdraw amount
	 * 1.when the account number is invalid, system should throw exception
	 * 2.when the account number is valid but withdraw amount>account amount, system should throw exception
	 * 3.when the valid info is passed, amount should be successfully updated
	 */
	@Test(expected=com.capgemini.exceptions.InvalidAccountNumberException.class)
	public void whenTheWithdrawInfoisInvalidSystemShouldThrowException() throws InvalidAccountNumberException, InsufficientBalanceException
	{
		accountService.withdrawAmount(102, 400);
	}
	
	@Test(expected=com.capgemini.exceptions.InsufficientBalanceException.class)
	public void whenTheWithdrawAmountisGreaterThanAccountAmountSystemShouldThrowException() throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account =new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepository.searchAccount(101)).thenReturn(account);
		accountService.withdrawAmount(101, 6000);
	}
	
	@Test
	public void whenTheValidInfoIsPassedAmountShouldBeWithdrawnSuccessfully() throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account =new Account();
		account.setAccountNumber(101);
		account.setAmount(5000);
		when(accountRepository.searchAccount(101)).thenReturn(account);
		assertEquals(4500, accountService.withdrawAmount(101, 500));
	}
	
}
