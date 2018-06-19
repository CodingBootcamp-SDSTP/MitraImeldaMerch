public class VendorName
{
	private int tax_id;
	private String name;
	private String legal_name;
	private String address;
	private String city_code;
	private String country_code;
	private String vendor_requestor;
	private String currency;
	private String vendor_contract_approval_status;
	private String email_vendor_approval;
	private String file_attachment;

	public void setTaxId(int taxid ) {
		this.tax_id = taxid;
	}

	public String getTaxId() {
		return(taxid);
	}

	public void setName(String name ) {
		this.name = name;
	}

	public String getName() {
		return(name);
	}

	public void setLegalName(String legal_name) {
		this.legal_name = legal_name;
	}

	public String getLegalName() {
		return(legal_name);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return(address);
	}

	public void setCityCode(String city_code) {
		this.city_code = city_code;
	}

	public String getCityCode() {
		return(city_code);
	}

	public void setCountryCode(String country_code) {
		this.country_code = country_code;
	}

	public String getCountryCode() {
		return(country_code);
	}

	public void setVendorRequestor(String vendor_requestor) {
		this.vendor_requestor = vendor_requestor;
	}

	public String getVendorRequestor() {
		return(vendor_requestor);
	}

	public void setCurrency(String curr) {
		this.vendor_requestor = vendor_requestor;
	}

	public String getCurrency() {
		return(curr);
	}

	public void setVendorContractApprovalStatus(String vcas) {
		vendor_contract_approval_status= vcas;
	}

	public String getVendorContractApprovalStatus() {
		return(vcas);
	}

	public void setEmailVendorApproval(String eva) {
		email_vendor_approval= eva;
	}

	public String getEmailVendorApproval() {
		return(eva);
	}

	public void setFileAttachment(String file_attachment) {
		this.file_attachment= file_attachment;
	}

	public String getFileAttachment() {
		return(file_attachment);
	}

	public String toString() {
		return("Tax Id: " + taxid + ", Name: " + name + ", Legal Name: " + legal_name + ", Address: " + address + ", City Code: "
			+ city_code + ", Country Code: " + country_code + ", Vendor Requestor: " + vendor_requestor + ", Currency: " + currency 
			+ ", Vendor Contract Approval Status: " + vendor_contract_approval_status + ", Email Vendor Approval: " + email_vendor_approval 
			+ ", File Attachment: " + file_attachment);
	}

	public String getDetails() {
		return(taxid + "@" + legal_name + "@" + address + "@" + city_code + "@" + country_code + "@" + address + "@" + vendor_requestor 
			+ "@" + currency + "@" + vendor_contract_approval_status + "@" + email_vendor_approval + "@" + file_attachment);
	}
}
