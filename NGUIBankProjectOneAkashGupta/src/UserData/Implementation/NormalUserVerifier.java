package UserData.Implementation;

import UserData.AbstractClasses.AbstractUser;
import UserData.AbstractClasses.AbstractUserData;
import UserData.AbstractClasses.UserVarifier;

public class NormalUserVerifier extends UserVarifier{
//
public boolean verifyAddress() {
		// TODO Auto-generated method stub
		return true;
	}


	public AbstractUser userCreaor(AbstractUserData AUD) {
		
		// TODO Auto-generated method stub
		if(AUD instanceof NormalUserData)
		return new NormalUser(AUD.name, AUD.phoneNumber, AUD.employeeID, AUD.address);
		return null;
	}
//
@Override
public boolean verifyAddress(AbstractUserData AUD) {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean verifyEmployeeID(AbstractUserData AUD) {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean verifyName(AbstractUserData AUD) {
	// TODO Auto-generated method stub
	return true;
}
@Override
public boolean verifyPhoneNumber(AbstractUserData AUD) {
	// TODO Auto-generated method stub
	return true;
}


@Override
public boolean extraVerification(AbstractUserData AUD) {
	// TODO Auto-generated method stub
	return true;
}



}
