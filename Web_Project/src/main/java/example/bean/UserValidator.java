package example.bean;

public class UserValidator {
	
	public static boolean isValid(User currentUser )
	{
		boolean validationStatus = false;
		
		String currentUserName = currentUser.getUserName();
		String currentPassword = currentUser.getPassword();
		
		if(currentUserName.equals("admin") && currentPassword.equals("asAdmin"))
		{
			validationStatus = true;
		}
		
		return validationStatus;
	}

}
