/**
 * 
 */
package LoanData.AbstractClasses;

import UserData.AbstractClasses.AbstractUser;

/**
 * @author abhgopal
 *
 */
public abstract class AbstractLoanUnit {
	
	public final int amount;
	public final AbstractUser owner;
	public final double rate;
	public final int timeToRepay;
	public final boolean typeOfInterest;
	
	
	public void pay(){}
	
	

	/**
	 * 
	 */
	public AbstractLoanUnit(int amount,AbstractUser owner ,double rate,int timeToRepay,boolean typeIfInterest) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
		this.owner=owner;
		this.rate=rate;
		this.timeToRepay=timeToRepay;
		this.typeOfInterest=typeIfInterest;
		
		
	}

}
