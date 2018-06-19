public class Users
{
	private String user_name;
	private String password;
	private String role;

	public void setUserName(String uname ) {
		user_name = uname;
	}

	public String getUserName() {
		return(user_name);
	}

	public void setPassword(int pw) {
		password = pw;
	}

	public int getPassword() {
		return(pw);
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return(role);
	}

	public String toString() {
		return("Username: " + user_name + ", Password: " + password + ", Role: " + role);
	}

	public String getDetails() {
		return(user_name + "@" + password + "@" + role);
	}
}
