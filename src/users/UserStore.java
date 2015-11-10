package users;

import incident.Incident;
import incidentstate.IncidentState;

import java.util.HashSet;
import java.util.Set;

/*
 * The password store in this example is supposed to be illustrative and
 * not representative of a secure system
 */
public class UserStore {
	private Set<BasicUser> users;
	private Set<UserPasswordHash> passwords;
	private static UserStore theInstance;
	
	private UserStore() {
		super();
		this.users = new HashSet<BasicUser>();
		this.passwords = new HashSet<UserPasswordHash>();
	}

	public static UserStore getInstance(){
		
		if(theInstance == null){
			theInstance = new UserStore();
		}
		
		return theInstance;
	}
	
	public Boolean addUser(BasicUser user){
		return users.add(user);
	}
	
	public Boolean removeUser(BasicUser user){
		return users.remove(user);
	}
	
	public Set<BasicUser> getAllUsers(){
		return users;
	}
	
	public void doUpdateAllUsers(Incident incident, IncidentState state){
		for (BasicUser u : users){
			u.doUpdate(incident, state);
		}
	}
	
	public Boolean addPasswordHash(UserPasswordHash passwordHash){
		return passwords.add(passwordHash);
	}
	
	public Boolean doValidateUserAllowed(BasicUser user, UserPasswordHash passwordhash){
		for(UserPasswordHash password : passwords){
			if(password.getUser() == user){
				return password.getPasswordHash() == passwordhash.getPasswordHash();
			}
		}
		return false;
	}
}
