import java.util.ArrayList;

public class CurrencyList
{
	private ArrayList<Currency> currency;

	public CurrencyList() {
		currency = new ArrayList<Currency>();
	}

	public void addCurrency(Currency currency) {
		this.currency.add(currency);
	}

	public void removeCurrency(Currency currency) {
		this.currency.remove(currency);
	}

	public ArrayList<Currency> getAllCurrency() {
		return(currency);
	}

	public Asset getCurrencyByIndex(int c) {
		return(currency.get(c));
	}

	public int getCurrencyCount() {
		return(currency.size());
	}

	public ArrayList<Currency> search(String s) {
		Currency c = null;
		ArrayList<Currency> cur = new ArrayList<Currency>();
		String str = s.toLowerCase();
		for(int i=0; i<getCurrencyCount(); i++) {
			c = getCurrencyByIndex(i);
			if(matches(c, str)) {
				cur.add(c);
			}
		}
		return(cur);
	}
}
