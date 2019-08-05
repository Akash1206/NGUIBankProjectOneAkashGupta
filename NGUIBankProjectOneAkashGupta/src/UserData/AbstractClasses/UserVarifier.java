package UserData.AbstractClasses;


import UserData.Interfaces.AddressVerifier;
import UserData.Interfaces.EmployeeIDVerifier;
import UserData.Interfaces.NameVerifier;
import UserData.Interfaces.PhoneNumberVerifier;

public abstract class UserVarifier implements AddressVerifier,EmployeeIDVerifier,NameVerifier,PhoneNumberVerifier{

	public UserVarifier() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public boolean extraVerification(AbstractUserData AUD);
	
	abstract public AbstractUser userCreaor(AbstractUserData AUD);
	
	public AbstractUser verify(AbstractUserData AUD){
		if(		verifyAddress(AUD) &&
				verifyEmployeeID(AUD)&&
				verifyName(AUD)&&
				verifyPhoneNumber(AUD)&&
				extraVerification(AUD)
				)return userCreaor(AUD);
		else return null;
	}

}
