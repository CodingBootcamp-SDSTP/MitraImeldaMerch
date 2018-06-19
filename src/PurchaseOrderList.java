import java.util.ArrayList;

public class PurchaseOrderList
{
	private ArrayList<PurchaseOrder> purchaseorder;

	public PurchaseOrderList() {
		purchaseorder = new ArrayList<PurchaseOrder>();
	}

	public void addPurchaseOrder(PurchaseOrder po) {
		purchaseorder.add(po);
	}

	public void removeFunction(PurchaseOrder po) {
		purchaseorder.remove(po);
	}

	public ArrayList<PurchaseOrder> getAllPurchaseOrder() {
		return(purchaseorder);
	}

	public PurchaseOrder getPurchaseOrderByIndex(int pur) {
		return(purchaseorder.get(pur));
	}

	public int getPurchaseOrderCount() {
		return(purchaseorder.size());
	}

	public ArrayList<PurchaseOrder> search(String s) {
		PurchaseOrder po = null;
		ArrayList<PurchaseOrder> p  = new ArrayList<PurchaseOrder>();
		String str = s.toLowerCase();
		for(int i=0; i<getPurchaseOrderCount(); i++) {
			po = getPurchaseOrderByIndex(i);
			if(matches(po, str)) {
				p.add(o);
			}
		}
		return(p);
	}
}
