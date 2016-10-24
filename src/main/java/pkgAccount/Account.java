package pkgAccount; //tim

import java.util.*;

public class Account {
	
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return DateCreated;
	}
	

		private int id = 0;
		private double balance = 0;
		private double annualInterestRate = 0;
		Date DateCreated;
		
		public Account() {
			this.id = id;
			this.balance = balance;
			this.annualInterestRate = annualInterestRate;
			
		}
		
		public Account(int SetId, double SetBalance) {
			id = SetId;
			balance = SetBalance;
		}
		
		public double getmonthlyInterestRate() {
			return annualInterestRate / 12.0;
		}
		
		public double Withdraw(double withdraw) {
			if (withdraw <= balance) {
				return balance -= withdraw;
			}
			else {
				return balance;
			}
		}
		
		public double Deposit(double deposit) {
			if (deposit >= 0) {
				return balance += deposit;
			}
			else {
				return balance;
			}
		}

	}	
