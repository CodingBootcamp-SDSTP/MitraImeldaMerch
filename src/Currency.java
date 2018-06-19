public class Currency
{
	private String description;

	public void setDescription(int desc) {
		description = desc;
	}

	public String getDescription() {
		return(desc);
	}	

	public String toString() {
		return("Description: " + description);
	}

	public String getDetails() {
		return(description + "@");
	}
}
