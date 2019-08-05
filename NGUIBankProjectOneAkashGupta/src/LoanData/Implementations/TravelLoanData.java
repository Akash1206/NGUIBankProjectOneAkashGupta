package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;

public class TravelLoanData extends AbstractLoanData{
	public int balance;
	public TravelLoanData(AbstractLoanUnit loan, int balance) {
		super(loan);
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}



}
