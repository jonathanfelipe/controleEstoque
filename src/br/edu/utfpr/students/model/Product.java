package br.edu.utfpr.students.model;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Product {

	private int product_id;
	private double price;
	private double cost;
	private int qnty_parts_to_build;
	private int quantity;
	private String name;
	private String description;

	/**
	 * @return the qnty_parts_to_build
	 */
	public int getQnty_parts_to_build() {
		return qnty_parts_to_build;
	}

	/**
	 * @param qnty_parts_to_build
	 *            the qnty_parts_to_build to set
	 */
	public void setQnty_parts_to_build(int qnty_parts_to_build) {
		if (qnty_parts_to_build >= 0)
			this.qnty_parts_to_build = qnty_parts_to_build;
	}

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
		if (price >= 0.0) {
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

	public void addQuantity(int quantity) {
		if (quantity > 0)
			this.quantity = quantity;
	}

	public void remQuantity(int quantity) {
		if (quantity < 0)
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
