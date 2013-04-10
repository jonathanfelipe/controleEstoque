package br.edu.utfpr.students.model;

import java.util.ArrayList;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Transaction {
	private int typeOfTransaction;
	private int TotalQuantity;
	private double TotalCost;

	// TABLE SEPARADA
	private ArrayList<Integer> productList;
	private ArrayList<Integer> productQtty;
	private ArrayList<Double> priceList;

	public int getTypeOfTransaction() {
		return typeOfTransaction;
	}

	public void setTypeOfTransaction(int typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}

	public int getTotalQuantity() {
		return TotalQuantity;
	}

	public void setTotalQuantity(int TotalQuantity) {
		this.TotalQuantity = TotalQuantity;
	}

	public double getTotalCost() {
		return TotalCost;
	}

	public void setTotalCost(double TotalCost) {
		this.TotalCost = TotalCost;
	}

	public ArrayList<Integer> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Integer> productList) {
		this.productList = productList;
	}

	public ArrayList<Integer> getProductQtty() {
		return productQtty;
	}

	public void setProductQtty(ArrayList<Integer> productQtty) {
		this.productQtty = productQtty;
	}

	public ArrayList<Double> getPriceList() {
		return priceList;
	}

	public void setPriceList(ArrayList<Double> priceList) {
		this.priceList = priceList;
	}

}
