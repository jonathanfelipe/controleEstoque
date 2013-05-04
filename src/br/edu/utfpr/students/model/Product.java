package br.edu.utfpr.students.model;

import java.util.LinkedList;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Product {
	// quantidade de produtos em estoque esta na tabela quantity
	// que contem quantity_id chave primaria
	// o id do produto product_id
	// e a quantidade quantity
	private int product_id;
	private double price;

	private boolean needSubcomponents;

	// quantidade e custo estao na tabela quantity

	private double cost;
	private int quantity;
	private int quantity_id;

	private String name;
	private String description;

	private LinkedList<Product> subcomponents;

	public Product(double price, boolean needSubcomponents, double cost,
			int quantity, String name, String description,
			LinkedList<Product> subcomponents) {
		super();
		this.price = price;
		this.needSubcomponents = needSubcomponents;
		this.cost = cost;
		this.quantity = quantity;
		this.name = name;
		this.description = description;
		this.subcomponents = subcomponents;
	}

	public Product() {
		super();
		product_id = 0;
		price = 0.0;
		needSubcomponents = false;
		cost = 0.0;
		quantity_id = 0;
		quantity = 0;
		name = "";
		description = "";
		subcomponents = new LinkedList<Product>();
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

	/**
	 * @return the needSubcomponents
	 */
	public boolean isNeedSubcomponents() {
		return needSubcomponents;
	}

	/**
	 * @param needSubcomponents
	 *            the needSubcomponents to set
	 */
	public void setNeedSubcomponents(boolean needSubcomponents) {
		this.needSubcomponents = needSubcomponents;
	}

	/**
	 * @return the subcomponents
	 */
	public LinkedList<Product> getSubcomponents() {
		return subcomponents;
	}

	/**
	 * @param subcomponents
	 *            the subcomponents to set
	 */
	public void setSubcomponents(LinkedList<Product> subcomponents) {
		this.subcomponents = subcomponents;
	}

	public void addSubcomponent(Product subcomponent) {
		if (subcomponents == null) {
			subcomponents = new LinkedList<Product>();
		}
		subcomponents.addLast(subcomponent);

	}

	/**
	 * @return the quantity_id
	 */
	public int getQuantity_id() {
		return quantity_id;
	}

	/**
	 * @param quantity_id
	 *            the quantity_id to set
	 */
	public void setQuantity_id(int quantity_id) {
		this.quantity_id = quantity_id;
	}
}
