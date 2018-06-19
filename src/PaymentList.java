import java.util.ArrayList;

public class PaymentList
{
	private ArrayList<Payments> payments;

	public PaymentList() {
		payments = new ArrayList<Payments>();
	}

	public void addPayment(Payment payments) {
		payments.add(payments);
	}

	public void removePayment(Payment payments) {
		payments.remove(payments);
	}

	public ArrayList<Payments> getAllPayments() {
		return(payments);
	}

	public Payments getPaymentByIndex(int p) {
		return(payments.get(p));
	}

	public int getPaymentCount() {
		return(payments.size());
	}

	public ArrayList<Payments> search(String s) {
		Payment p = null;
		ArrayList<Payments> pay = new ArrayList<Payments>();
		String str = s.toLowerCase();
		for(int i=0; i<getPaymentCount(); i++) {
			f = getPaymentByIndex(i);
			if(matches(p, str)) {
				pay.add(f);
			}
		}
		return(pay);
	}
}
