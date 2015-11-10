package users;

public class UserPasswordHash {
	
	private String passwordHash;
	private BasicUser user;

	public UserPasswordHash(String passwordHash, BasicUser user) {
		super();
		this.passwordHash = passwordHash;
		this.user = user;
	}

	/**
	 * @return the passwordHash
	 */
	public String getPasswordHash() {
		return passwordHash;
	}

	/**
	 * @param passwordHash the passwordHash to set
	 */
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	/**
	 * @return the user
	 */
	public BasicUser getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(BasicUser user) {
		this.user = user;
	}
	
	

}
