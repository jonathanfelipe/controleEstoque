/**
 * 
 */
package br.edu.utfpr.students.model;

import java.util.Calendar;
import java.util.LinkedList;

/**
 * @author raphael
 * 
 */
public class Buy {
	// compra do supplier

	// tabela de compra contera somente a pk buy_id
	// a data da compra: buydate
	// e o custo total: totalcost
	private int buy_id;
	private Calendar date;
	private double totalCost;
	// havera uma tabela para ligar a tabela buy com a purshashed_products
	// que contera o id do produto
	// o custo do produto: cost
	// e a quantidade comprada: quantity

	private LinkedList<Product> productList;

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @return the buy_id
	 */
	public int getBuy_id() {
		return buy_id;
	}

	/**
	 * @param buy_id
	 *            the buy_id to set
	 */
	public void setBuy_id(int buy_id) {
		this.buy_id = buy_id;
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
	 * @return the productList
	 */
	public LinkedList<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList
	 *            the productList to set
	 */
	public void setProductList(LinkedList<Product> productList) {
		this.productList = productList;
	}

	public void addProductToList(Product product) {
		this.productList.addLast(product);
	}

	public void remProductFromList(Product product) {
		this.productList.remove(product);
	}

}
