/**
 * 
 */
package br.edu.utfpr.students.model;

import java.util.ArrayList;

/**
 * @author raphael
 * 
 */
public class Sell {
	private int sell_id;
	private double total;
	private double totalCost;
	private double totalEarn;

	private ArrayList<Integer> productList;
	private ArrayList<Double> priceList;
	private ArrayList<Double> costList;
	private ArrayList<Integer> quantity;

	/**
	 * @return the quantity
	 */
	public ArrayList<Integer> getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(ArrayList<Integer> quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the costList
	 */
	public ArrayList<Double> getCostList() {
		return costList;
	}

	/**
	 * @param costList
	 *            the costList to set
	 */
	public void setCostList(ArrayList<Double> costList) {
		this.costList = costList;
	}

	/**
	 * @return the priceList
	 */
	public ArrayList<Double> getPriceList() {
		return priceList;
	}

	/**
	 * @param priceList
	 *            the priceList to set
	 */
	public void setPriceList(ArrayList<Double> priceList) {
		this.priceList = priceList;
	}

	/**
	 * @return the productList
	 */
	public ArrayList<Integer> getProductList() {
		return productList;
	}

	/**
	 * @param productList
	 *            the productList to set
	 */
	public void setProductList(ArrayList<Integer> productList) {
		this.productList = productList;
	}

	/**
	 * @return the totalEarn
	 */
	public double getTotalEarn() {
		return totalEarn;
	}

	/**
	 * @param totalEarn
	 *            the totalEarn to set
	 */
	public void setTotalEarn(double totalEarn) {
		this.totalEarn = totalEarn;
	}

	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost
	 *            the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the sell_id
	 */
	public int getSell_id() {
		return sell_id;
	}

	/**
	 * @param sell_id
	 *            the sell_id to set
	 */
	public void setSell_id(int sell_id) {
		this.sell_id = sell_id;
	}
}
