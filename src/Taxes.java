public class Taxes
{
	private String tax_code;
	private int tax_value;
	private String currency;

	public void setTaxCode(String tax_code) {
		this.tax_code = tax_code;
	}

	public String getTaxCode() {
		return(tax_code);
	}

	public void setTaxValue(int tax_value) {
		this.tax_value = tax_value;
	}

	public int getTaxValue() {
		return(tax_value);
	}
	
	public void setCurrency(String curr) {
		currency = curr;
	}

	public String getCurrency() {
		return(curr);
	}

	public String toString() {
		return("Tax Code: " + tax_code + ", Tax Value: " + tax_value + ", Currency: " + currency);
	}

	public String getDetails() {
		return(tax_code + "@" + tax_value + "@" + currency);
	}
}
