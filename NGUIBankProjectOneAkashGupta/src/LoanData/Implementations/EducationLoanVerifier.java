package LoanData.Implementations;

import LoanData.AbstractClasses.AbstractLoanData;
import LoanData.AbstractClasses.AbstractLoanUnit;
import LoanData.AbstractClasses.AbstractLoanVerifier;

public class EducationLoanVerifier extends AbstractLoanVerifier {

	public EducationLoanVerifier() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public boolean extraVerification(AbstractLoanData ALD){
		 if(!(ALD instanceof EducationLoanData))
			 return false;
		 EducationLoanData data = (EducationLoanData)ALD;
		 if(data.parentBal >= 500000)
			 return true;
		 return false;
	 }
	 
	 public AbstractLoanUnit loanCreator(AbstractLoanData ALD){
		 return ALD.loan;
	 }
	

}
