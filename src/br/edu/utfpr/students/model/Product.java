package br.edu.utfpr.students.model;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Product {

	private int product_id;
	private double price;
	private double cost;
	private int quantity;
	private String name;
	private String description;

	/**
	 * 
	 * @return
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * 
	 * @param product_id
	 */
	public void setProduct_id(int product_id) {
		if (product_id > 0) {
			this.product_id = product_id;
		}
	}

	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		if (price > 0.0) {
			this.price = price;
		}

	}

	/**
	 * 
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {

		this.quantity = quantity;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		if (!description.isEmpty()) {
			this.description = description;
		}
	}

	/**
	 * 
	 * @return
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * 
	 * @param cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
}
