public class UserRole
{
	private String role_code;
	private String description;

	public void setRoleCode(int role_code) {
		this.role_code = role_code;
	}

	public String getRoleCode() {
		return(role_code);
	}

	public void setDescription(int desc) {
		description = desc;
	}

	public String getDescription() {
		return(desc);
	}	

	public String toString() {
		return("User Role: " + role_code + ", Description: " + description );
	}

	public String getDetails() {
		return(role_code + "@" + description + "@");
	}
}
