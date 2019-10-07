package Creational.AbstractFactoryPattern.LoanFactory;

public class HomeLoan extends Loan {
	public void getInterestRate(double r) {
		rate = r;
	}
}// End of the HomeLoan class.