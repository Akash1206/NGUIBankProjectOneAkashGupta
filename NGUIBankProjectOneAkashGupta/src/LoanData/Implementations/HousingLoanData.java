package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;
import UserData.AbstractClasses.AbstractUser;

public class HousingLoanData extends AbstractLoanData{
	public int balance;
	public HousingLoanData(AbstractLoanUnit loan, int balance) {
		super(loan);
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}



}
