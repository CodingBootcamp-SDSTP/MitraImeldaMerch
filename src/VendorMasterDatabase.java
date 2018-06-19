import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.sql.*;

public class VendorMasterDatabase
{	
	private CurrencyList currency;
	private FunctionList functions;
	private PaymentList payments;
	private PurchaseOrderList purchaseorder;
	private TaxList taxes;
	private UserList users;
	private UserRoleList roles;
	private VendorList vendors;

	public VendorMasterDatabase() {
		vendors = new VendorList();
		currency = new CurrencyList();
		functions = new FunctionList();
		payments = new PaymentList();
		purchaseorder = new PurchaseOrderList();
		taxes = new TaxList();
		users = new UserList();
		roles = new UserRoleList();
		if(c == null) {
			System.out.println("Error connecting to your MySQL Database...");
		}
		else {
			System.out.println("Connected!");
			readFromMySQLDB(c);
		}
	}

	public Connection connectdb() {
		Connection v= null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			v = DriverManager.getConnection("jdbc:mysql://localhost/merchprojectdb?user=imz&password=sakurasan0920&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
		}
		catch(Exception e) {
			v = null;
			e.printStackTrace();
		}
		finally {
			try { if (stmt != null) stmt.close(); } catch (Exception e) {};
		}
		return(v);
	}

	public CurrencyList getCurrency() {
		return(currency);
	}

	public FunctionList getFunctions() {
		return(functions);
	}

	public PaymentList getPayments() {
		return(payments);
	}

	public PurchaseOrderList getPurchaseOrder() {
		return(purchaseorder);
	}	

	public TaxList getTax() {
		return(taxes);
	}

	public UserList getUsers() {
		return(users);
	}

	public UserRoleList getRoles() {
		return(roles);
	}	

	public VendorList getVendors() {
		return(vendors);
	}

	public Person getVendorById(String id) {
		return(vendors.getVendorById(id));
	}

	public ArrayList<Object> search(String s) {
		ArrayList<Object> obj = new ArrayList<Object>();
		ArrayList<Currency> curr = new ArrayList<Currency>();
		ArrayList<Functions> func = new ArrayList<Functions>();
		ArrayList<Payments> pay = new ArrayList<Payments>();
		ArrayList<PurchaseOrder> po = new ArrayList<PurchaseOrder>();
		ArrayList<Taxes> tax = new ArrayList<Taxes>();
		ArrayList<Users> user = new ArrayList<Users>();
		ArrayList<UserRole> roles = new ArrayList<UserRole>();
		ArrayList<Vendor> vendor = new ArrayList<Vendor>();
		// ArrayList<Vendor> vendor = vendors.search(s);
		obj.addAll(curr);
		obj.addAll(func);
		obj.addAll(pay);
		obj.addAll(po);
		obj.addAll(tax);
		obj.addAll(user);
		obj.addAll(roles);
		obj.addAll(vendor);
		return(obj);
	}

	void readFromMySQLDB(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_currency;");
			while(rs.next()) {
				String[] str = {
					rs.getInt("id"),
					rs.getString("description"),
					"currency"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_function;");
			while(rs.next()) {
				String[] str = {
					rs.getString("function_code"),
					rs.getString("description"),
					rs.getString("functionx"),
					rs.getString("role_code"),
					"function"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_payments;");
			while(rs.next()) {
				String[] str = {
					rs.getInt("payment_id"),
					rs.getString("bank_account_name"),
					rs.getInt("bank_account_number"),
					rs.getString("payment_address"),
					rs.getString("payment_currency"),
					"payments"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_purchase_order;");
			while(rs.next()) {
				String[] str = {
					rs.getInt("purchase_order_number"),
					rs.getInt("contract_number"),
					rs.getString("PO_vendor_name"),
					rs.getString("legal_name"),
					rs.getString("bill_to"),
					rs.getString("purchase_order_currency"),
					rs.getString("vendor_requestor"),
					rs.getString("vendor_contract_approval_status"),
					rs.getString("email_vendor_approval"),
					s.getString("file_attachment"),
					"purchase_order"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_taxes;");
			while(rs.next()) {
				String[] str = {
					rs.getString("tax_code"),
					rs.getInt("tax_value"),
					rs.getString("currency"),
					"taxes"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_user;");
			while(rs.next()) {
				String[] str = {
					rs.getInt("use_id"),
					rs.getString("username"),
					rs.getString("password"),
					rs.getString("roles"),
					"user"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_user_role;");
			while(rs.next()) {
				String[] str = {
					rs.getString("role_code"),
					rs.getString("description"),
					"user_role"
				};
				createObject(str);
			}
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM tbl_vendor_name;");
			while(rs.next()) {
				String[] str = {
					rs.getInt("vendor_id"),
					rs.getInt("tax_id"),
					rs.getString("name"),
					rs.getString("legal_name"),
					rs.getString("address"),
					rs.getString("city_code"),
					rs.getString("country_code"),
					rs.getString("vendor_requestor"),
					rs.getString("vendor_contract_approval_status"),
					rs.getString("email_vendor_approval"),
					rs.getString("file_attachment"),
					"user_role"
				};
				createObject(str);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if(stmt!=null) {stmt=null;}} catch(Exception e) {};
			try { if(rs!=null) {rs=null;}} catch(Exception e) {};
		}
	}

	public void createObject(String... details) {
		int len = details.length - 1;
		String d = details[len];
		if("currency".equals(d)) {
			Currency curr = new Currency(details[0], details[1]);
			currency.addCurrency(curr);
		}
		else if("function".equals(d)) {
			Function func = new Function(details[0], details[1], details[2], details[3]);
			function.addFunction(func);
		}
		else if("payments".equals(d)) {
			Payments payments = new Payments(details[0], details[1], details[2], details[3], details[4]);
			payments.addPayments(payments);
		}
		else if("purchase_order".equals(d)) {
			PurchaseOrder po = new PurchaseOrder(details[0], details[1], details[2], details[4], details[5], details[6], 
				details[7], details[8], details[9]);
			purchaseorder.addPurchaseOrder(po);
		}
		else if("taxes".equals(d)) {
			Taxes tax = new Taxes(details[0], details[1], details[2]);
			taxes.addTaxes(tax);
		}
		else if("user".equals(d)) {
			User user = new User(details[0], details[1], details[2], details[3]);
			user.addUser(user);
		}
		else if("user_role".equals(d)) {
			UserRole user_role = new UserRole(details[0], details[1]);
			user_role.addUserRole(user_role);
		}
		else if("vendor_name".equals(d)) {
			VendorName vendor_name= new VendorName(details[0], details[1], details[3], details[4], details[5], details[6], 
				details[7], details[8], details[9], details[10], details[11]);
			vendor_name.addVendorName(vendor_name);
		}
	}
7
	public boolean writeToFile(String filename) {
		boolean f = false;
		try {
			FileWriter fWriter = new FileWriter(filename);
			BufferedWriter fbw = new BufferedWriter(fWriter);
			fbw.write(getCollectionContent());
			fbw.close();
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return(f);
	}

	public String getCollectionContent() {
		ArrayList<Currency> c = currency.getAllCurrency();
		ArrayList<Functions> f = function.getAllFunction();
		ArrayList<Payments> p = payment.getAllPayments();
		ArrayList<PurchaseOrder> pur = purchase_order.getAllPurchaseOrder();
		ArrayList<Taxes> t = tax.getAllTaxes();
		ArrayList<Users> u = user.getAllUsers();
		ArrayList<UserRole> r = role.getAllRoles();
		ArrayList<Vendors> v = vendor.getAllVendor();
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<c.size(); i++) {
			Currency currency = c.get(i);
			sb.append(currency.getDetails() + "\n");
		}
		for(int i=0; i<f.size(); i++) {
			Function functions = f.get(i);
			sb.append(functions.getDetails() + "\n");
		}
		for(int i=0; i<p.size(); i++) {
			Payments payments = p.get(i);
			sb.append(payments.getDetails() + "\n");
		}
		for(int i=0; i<pur.size(); i++) {
			PurchaseOrder purchase_order = pur.get(i);
			sb.append(purchase_order.getDetails() + "\n");
		}
		for(int i=0; i<t.size(); i++) {
			Taxes tax = t.get(i);
			sb.append(tax.getDetails() + "\n");
		}
		for(int i=0; i<u.size(); i++) {
			Users user = u.get(i);
			sb.append(user.getDetails() + "\n");
		}
		for(int i=0; i<r.size(); i++) {
			UserRole roles = r.get(i);
			sb.append(role.getDetails() + "\n");
		}
		for(int i=0; i<v.size(); i++) {
			Vendors vendor = v.get(i);
			sb.append(vendor.getDetails() + "\n");
				if(i<v.size()-1) {
				sb.append("\n");
			}
		}
		return(sb.toString());
	}
}
