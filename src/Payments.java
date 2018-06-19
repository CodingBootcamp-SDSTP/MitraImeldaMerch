public class Payments
{
	private String bank_account_name;
	private int bank_account_number;
	private String payment_address;

	public void setBankAccountName(int bank_acct_name) {
		bank_account_name = bank_acct_name;
	}

	public String getBankAccountName() {
		return(bank_acct_name);
	}
	
	public void setBankAccountNumber(int bank_acct_num) {
		bank_account_number = bank_acct_num;
	}

	public int getBankAccountNumber() {
		return(bank_acct_num);
	}

	public void setPaymentAddress(int pay_add) {
		payment_address = pay_add;
	}

	public String getPaymentAddress() {
		return(pay_add);
	}	

	public void setPaymentCurrency(int pay_curr) {
		payment_currency = pay_curr;
	}

	public String getPaymentCurrency() {
		return(pay_curr);
	}

	public String toString() {
		return("Bank Account Name: " + bank_account_name + ", Bank Account Number: " + bank_account_number 
			+ ", Payment Address: " + payment_address);
	}

	public String getDetails() {
		return(bank_account_name + "@" + bank_account_number + "@" + payment_address);
	}
}
