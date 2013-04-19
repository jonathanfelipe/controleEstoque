/**
 * 
 */
package br.edu.utfpr.students.model;

import java.sql.Date;
import java.util.LinkedList;

/**
 * @author raphael
 * 
 */
public class Sell {
	//venda para o cliente
	//tabela venda contendo pk sell_id
	//total da venda: total
	//custo total: totalCost
	//total ganho: totalEarn //eg consulta verificar faturamento do mes
	//data: selldate			 // select totalearn from selled where date between data e data
	private int sell_id;
	private double total;
	private double totalCost;
	private double totalEarn;
	private Date date;
	//tabela separa para ligar id da venda ao id da lista de produtos vendidos
	//contendo somente informacoes pertimentes para venda
	//id do produto (para descricoes) product_id
	//quantidade vendida: quantity
	//custo na epoca de venda: cost
	//informacao de por quanto foi vendido: price
	//a ligacao entre a tabela de venda e a tabela de produto many-to-many
	//sera feita atravez de uma tabela intermediaria 
	//relacionando sell_id -> sold_products_id
	private LinkedList<Product> productList;

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
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the productList
	 */
	public LinkedList<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(LinkedList<Product> productList) {
		this.productList = productList;
	}
	
	public void addProductToList(Product product){
		this.productList.addLast(product);
	}
	
	public void remProductFromList(Product product){
		this.productList.remove(product);
	}
}
