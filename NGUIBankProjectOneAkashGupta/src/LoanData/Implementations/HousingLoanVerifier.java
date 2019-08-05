package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;
import LoanData.AbstractClasses.AbstractLoanVerifier;

public class HousingLoanVerifier extends AbstractLoanVerifier {

	public HousingLoanVerifier() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	 public boolean extraVerification(AbstractLoanData ALD){
		 if(!(ALD instanceof HousingLoanData))
			 return false;
		 HousingLoanData data = (HousingLoanData)ALD;
		 if(data.balance >= 1000000)
			 return true;
		 return false;
	 }
	 
	 public AbstractLoanUnit loanCreator(AbstractLoanData ALD){
		 return ALD.loan;
	 }
	

}
