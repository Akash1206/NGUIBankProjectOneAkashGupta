package LoanData.AbstractClasses;

public abstract class AbstractLoanVerifier {
	
	abstract public boolean extraVerification(AbstractLoanData ALD);
	
	abstract public AbstractLoanUnit loanCreator(AbstractLoanData ALD);
	
	final public AbstractLoanUnit verify(AbstractLoanData ALD){
		if(extraVerification(ALD))return loanCreator(ALD);
		else return null;
	}

	public AbstractLoanVerifier() {
		// TODO Auto-generated constructor stub
	}

}
