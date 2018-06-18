DROP TABLE IF EXISTS tbluser;
	CREATE TABLE tbl_user (
	userid INTEGER AUTO_INCREMENT,
	username VARCHAR(50) NOT NULL,
	password VARCHAR(15) NOT NULL,
	role VARCHAR(15) NOT NULL,
	PRIMARY KEY(userid)
);

	CREATE TABLE tbl_user_role (  --employeerole
	role_code VARCHAR(15) NOT NULL,
	description VARCHAR(255) NOT NULL,
	PRIMARY KEY(role_code)
);

	CREATE TABLE tbl_function (  --functionrestriction
	function_code VARCHAR(50) NOT NULL,
	description VARCHAR(50) NOT NULL,
	function VARCHAR(255) NOT NULL,
	role_code VARCHAR(15) NOT NULL,
	PRIMARY KEY(function_code)
);

	CREATE TABLE tbl_vendor_name (
	vendor_id INTEGER AUTO_INCREMENT,
	tax_id INTEGER (255) NOT NULL,
	name VARCHAR (255) NOT NULL,
	legal name VARCHAR (75) NOT NULL,
	address VARCHAR (255) NOT NULL,
	city_code VARCHAR (255) NOT NULL,
	country_code VARCHAR (255) NOT NULL,
	vendor_requestor VARCHAR (50) NOT NULL,
	currency VARCHAR (15) NOT NULL,
	vendor_contract_approval_status VARCHAR (255) NOT NULL,
	email_vendor_approval VARCHAR (255) NOT NULL,
	file_attachment VARCHAR (255) NOT NULL,
	PRIMARY KEY(vendor_id)
);
	
	CREATE TABLE tbl_purchase_order (
	purchase_order_number INTEGER AUTO_INCREMENT,
	contract_number INTEGER (255) NOT NULL,
	PO_vendor_name VARCHAR (255) NOT NULL,
	legal name VARCHAR (75) NOT NULL,
	bill_to VARCHAR (255) NOT NULL,
	purchase_order_currency VARCHAR (15) NOT NULL,
	vendor_requestor VARCHAR (50) NOT NULL,
	vendor_contract_approval_status VARCHAR (255) NOT NULL,
	email_vendor_approval VARCHAR (255) NOT NULL,
	file_attachment VARCHAR (255) NOT NULL,
	PRIMARY KEY(vendor_id)
	FOREIGN KEY(purchase_order_vendor_name) REFERENCES tbl_vendor_name(name),
	FOREIGN KEY(bill_to) REFERENCES tbl_vendor_name(address),
	FOREIGN KEY(purchase_order_currency) REFERENCES tbl_vendor_name(currency)
);

	CREATE TABLE tbl_payments (
	payment_id INTEGER AUTO_INCREMENT,
	bank_account_name VARCHAR (255) NOT NULL,
	bank_account_number INTEGER (255) NOT NULL,
	payment_address VARCHAR (255) NOT NULL,
	payment_currency VARCHAR (255) NOT NULL,name(name),
	FOREIGN KEY(bank_account_name) REFERENCES tbl_vendor_name(name)
	FOREIGN KEY(payment_currency) REFERENCES tbl_vendor_name(currency)
);

	CREATE TABLE tbl_currency (
	currency_id INTEGER AUTO_INCREMENT,
	description VARCHAR (255) NOT NULL,
	PRIMARY KEY(currency_id)
	FOREIGN KEY(payment_currency) REFERENCES tbl_vendor_name(currency)
);

	CREATE TABLE tbl_taxes (
	tax_code INTEGER (255) NOT NULL,
	tax_value INTEGER (255) NOT NULL,
	currency VARCHAR (255) NOT NULL,
	PRIMARY KEY(tax_code)
	FOREIGN KEY(currency) REFERENCES tbl_vendor_name(currency)
);
