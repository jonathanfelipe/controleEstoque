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
public class Sell {
	// venda para o cliente
	// tabela venda contendo pk sell_id
	// total da venda: total
	// custo total: totalCost
	// total ganho: totalEarn //eg consulta verificar faturamento do mes
	// data: selldate // select totalearn from selled where date between data e
	// data
	private int sell_id;
	private int client_id;
	private double total;
	private double totalCost;
	private double totalEarn;
	private Calendar date;
	// tabela separa para ligar id da venda ao id da lista de produtos vendidos
	// contendo somente informacoes pertimentes para venda
	// id do produto (para descricoes) product_id
	// quantidade vendida: quantity
	// custo na epoca de venda: cost
	// informacao de por quanto foi vendido: price
	// a ligacao entre a tabela de venda e a tabela de produto many-to-many
	// sera feita atravez de uma tabela intermediaria
	// relacionando sell_id -> sold_products_id
	private LinkedList<Product> productList;

	public Sell() {
		super();
		sell_id = 0;
		client_id = 0;
		total = 0.0;
		totalCost = 0.0;
		totalEarn = 0.0;
		date = null;
		productList = new LinkedList<Product>();
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
		productList.addLast(product);
	}

	public void remProductFromList(Product product) {
		productList.remove(product);
	}

	/**
	 * @return the client_id
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * @param client_id
	 *            the client_id to set
	 */
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
}
