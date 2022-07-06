/**
 * This package is used to take in a user inputs.
 */
package com.qa.ims.controller;

DBConfig db = new DBConfig();

Statement stmt = null;
Connection conn = db.connect();

public Item addItem(Items item) {
	try {
		String query = "INSERT INTO item(name, product_id, stock) VALUE(?,?,?);" ;
		PreStmt.setString(1, customer.getName());
		PreStmt.setString(2, customer.getProduct_id());
		PreStmt.setString(3, customer.getStock());
		PreStmt.executeUpdate();
		system.out.println("Customer added");
		return customer;
		
	} catch (Exception e) {
		System.out.println("Didn't work" + e);
		return null;
	}

}

public Items modelItem(ResultSet result) {
