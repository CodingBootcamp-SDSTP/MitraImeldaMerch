import java.util.ArrayList;

public class TaxList
{
	private ArrayList<Taxes> taxes;

	public TaxList() {
		taxes = new ArrayList<Taxes>();
	}

	public void addTax(Taxes tax) {
		taxes.add(tax);
	}

	public void removeTax(Taxes tax) {
		taxes.remove(tax);
	}

	public ArrayList<Taxes> getAllTax() {
		return(taxes);
	}

	public Tax getTaxByIndex(int tax) {
		return(taxes.get(tax));
	}

	public int getTaxCount() {
		return(taxes.size());
	}

	public ArrayList<Taxes> search(String s) {
		Taxes tax = null;
		ArrayList<Taxes> t  = new ArrayList<Taxes>();
		String str = s.toLowerCase();
		for(int i=0; i<getTaxCount(); i++) {
			tax = getTaxByIndex(i);
			if(matches(tax, str)) {
				t.add(tax);
			}
		}
		return(t);
	}
}
