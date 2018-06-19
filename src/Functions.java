public class Functions
{
	private String function_code;
	private String description;
	private String functionx;
	private String role_code;

	public void setFunctionCode(String func_code) {
		function_code = func_code;
	}

	public String getFunctionCode() {
		return(func_code);
	}

	public void setDescription(int desc) {
		description = desc;
	}

	public int getDescription() {
		return(desc);
	}

	public int getFunctionx() {
		return(fx);
	}

	public void setFunctionx(int fx) {
		functionx = fx;
	}

	public void setRoleCode(int rc) {
		role_code = rc;
	}

	public int getRoleCode() {
		return(rc);
	}

	public String toString() {
		return("Function Code: " + function_code + ", Description: " + description + ", Function: " + functionx 
			+ ", Role Code: " + role_code);
	}

	public String getDetails() {
		return(function_code + "@" + function_code + "@" + description + "@" + functionx + "@" + role_code);
	}
}
