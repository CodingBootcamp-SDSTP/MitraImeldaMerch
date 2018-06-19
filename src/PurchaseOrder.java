public class Purchase_Order
{
	private int contract_number;
	private String PO_vendor_name;
	private String legal_name;
	private String bill_to;
	private int purchase_order_currency;
	private String vendor_requestor;
	private boolean vendor_contract_approval_status;
	private boolean email_vendor_approval;
	private boolean file_attachment;

	public void setContractNumber(int contract_num) {
		this.contract_number = contract_number;
	}

	public int getContractNumber() {
		return(contract_num);
	}
	
	public void setPOVendorName(String po_vendor_name) {
		this.po_vendor_name = po_vendor_name;
	}

	public String getPOVendorName() {
		return(po_vendor_name);
	}

	public void setLegalName(String legal_name) {
		this.legal_name = legal_name;
	}

	public String getLegalName() {
		return(legal_name);
	}	

	public void setBillTo(String bill_to) {
		this.bill_to = bill_to;
	}

	public String getBillTo() {
		return(bill_to);
	}

	public void setPurchaseOrderCurrency(int po_curr) {
		po_currency = po_curr;
	}

	public int getPurchaseOrderCurrency() {
		return(po_curr);
	}

	public void setVendorRequestor(String po_curr) {
		po_currency = po_curr;
	}

	public String getVendorRequestor() {
		return(po_curr);
	}

	public void setVendorContractApprovalStatus(boolean contract_status) {
		vendor_contract_approval_status = contract_status;
	}

	public boolean getVendorContractApprovalStatus() {
		return(contract_status);
	}

	public void setEmailVendorApproval(boolean email_vendor_approval) {
		this.email_vendor_approval = email_vendor_approval;
	}

	public boolean getEmailVendorApproval() {
		return(email_vendor_approval);
	}

	public void setFileAttachment(boolean file_attachment) {
		this.file_attachment = file_attachment;
	}

	public boolean getFileAttachment() {
		return(file_attachment);
	}

	public String toString() {
		return("Contract Number: " + contract_number + ", PO Vendor Name: " 
			+ po_vendor_name + ", Legal Name: " + legal_name + ", Bill To: " + bill_to + ", Purchase Order Currency: " 
			+ purchase_order_currency + ", Vendor Requestor: " + vendor_requestor + ", Vendor Contract Approval Status: " 
			+ vendor_contract_approval_status + ", Email Vendor Approval: " + email_vendor_approval + ", File Attachment: " 
			+ file_attachment);
	}

	public String getDetails() {
		return(contract_number + "@" + po_vendor_name + "@" + legal_name + "@" + purchase_order_currency + "@" 
			+ vendor_requestor + "@" + vendor_contract_approval_status + "@" + email_vendor_approval + "@" + file_attachment);
	}
}
