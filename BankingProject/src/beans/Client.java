package beans;

import exceptions.InsufficientBalanceException;
import exceptions.InsufficientOpeningBalanceException;
import exceptions.InvalidAccountNumberException;

public class Client {

	public static void main(String[] args) throws InsufficientOpeningBalanceException {
		ICICIBank bank = new ICICIBank();
		
		System.out.println(bank.createAccount(101, 3000));
		System.out.println(bank.createAccount(102, 3000));

		
		try
		{
			System.out.println("Balance = "+bank.withdrawAmount(101, 2000));
			System.out.println("Balance = "+bank.depositAmount(102, 250));
			System.out.println("Transfer Balance "+bank.transferAmount(101,102,500));
		}catch(InvalidAccountNumberException i)
		{
			System.out.println("Invalid account number ");
		}
		catch(InsufficientBalanceException ibe){
			System.out.println("insufficient balance");
		}
		
		try
		{
			System.out.println(bank.createAccount(103, 400));
		} catch(InsufficientOpeningBalanceException iob) {
			System.out.println("insufficient opening balance");
		}

	}

}