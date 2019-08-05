package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;
import LoanData.AbstractClasses.AbstractLoanVerifier;

public class PersonalLoanVerifier extends AbstractLoanVerifier {
	public PersonalLoanVerifier() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public boolean extraVerification(AbstractLoanData ALD){
		 if(!(ALD instanceof PersonalLoanData))
			 return false;
		 return true;
	 }
	 public AbstractLoanUnit loanCreator(AbstractLoanData ALD){
		 return ALD.loan;
	 }
}
