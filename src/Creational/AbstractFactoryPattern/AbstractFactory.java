package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.BankFactory.Bank;
import Creational.AbstractFactoryPattern.LoanFactory.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}