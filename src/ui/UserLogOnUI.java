package ui;

import users.BasicUser;
import users.UserPasswordHash;
import users.UserStore;

public class UserLogOnUI {

	public static Boolean doUserLogOn(BasicUser user, UserPasswordHash passwordHash){
		UserStore userStore = UserStore.getInstance();
		return userStore.doValidateUserAllowed(user, passwordHash);
	}
}
