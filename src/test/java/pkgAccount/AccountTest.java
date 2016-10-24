package pkgAccount;

import static org.junit.Assert.*;

import org.junit.Test;


public class AccountTest {

	
	@Test
	public void withdrawTestPass() {
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
	Account myAccount = new Account(id, balance);
	double newbalance = myAccount.Withdraw(2500);
	System.out.println("new balance " + newbalance);
	System.out.println("monthly interest rate " + myAccount.getmonthlyInterestRate());
	System.out.println("date created " + myAccount.getDateCreated());
	assertEquals(newbalance, 17500.00, .01);
	}
	
	@Test
	public void withdrawTestFail() {
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
	Account myAccount = new Account(id, balance);
	double newbalance = myAccount.Withdraw(30000);
	System.out.println("new balance " + newbalance);
	System.out.println("monthly interest rate " + myAccount.getmonthlyInterestRate());
	System.out.println("date created " + myAccount.getDateCreated());
	assertEquals(newbalance, 20000, .01);
	}
	
	@Test
	public void depositTestPass() {
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
	Account myAccount = new Account(id, balance);
	double newbalance = myAccount.Deposit(3000);
	System.out.println("new balance " + newbalance);
	System.out.println("monthly interest rate " + myAccount.getmonthlyInterestRate());
	System.out.println("date created " + myAccount.getDateCreated());
	assertEquals(newbalance, 23000, .01);
	}
	
	
	@Test
	public void depositTestFail() {
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = 4.5;
	Account myAccount = new Account(id, balance);
	double newbalance = myAccount.Deposit(-3000);
	System.out.println("new balance " + newbalance);
	System.out.println("monthly interest rate " + myAccount.getmonthlyInterestRate());
	System.out.println("date created " + myAccount.getDateCreated());
	assertEquals(newbalance, 20000, .01);
	}
}
