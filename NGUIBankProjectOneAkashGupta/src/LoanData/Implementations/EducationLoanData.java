package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;

public class EducationLoanData extends AbstractLoanData{
	public int parentBal;
	public EducationLoanData(AbstractLoanUnit loan, int parentBal) {
		super(loan);
		this.parentBal = parentBal;
		// TODO Auto-generated constructor stub
	}



}
