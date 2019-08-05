package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;
import LoanData.AbstractClasses.AbstractLoanVerifier;

public class TravelLoanVerifier extends AbstractLoanVerifier {

	public TravelLoanVerifier() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public boolean extraVerification(AbstractLoanData ALD){
		 if(!(ALD instanceof TravelLoanData))
			 return false;
		 TravelLoanData data = (TravelLoanData)ALD;
		 if(data.balance >= 5000000)
			 return true;
		 return false;
	 }
	 
	 public AbstractLoanUnit loanCreator(AbstractLoanData ALD){
		 return ALD.loan;
	 }

}
