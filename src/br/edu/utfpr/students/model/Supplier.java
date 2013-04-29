package br.edu.utfpr.students.model;

import java.util.LinkedList;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Supplier {

	private int supplier_id;
	private String name;
	// primeiro inserir o endereco e o contato na tabela e com os ids deles
	// entao criar o supplier
	private Address addr;
	private Contact cont;
	private int legalPersonNumber;
	// tabela separada many-to-many //tabela provides relaciona supplier ->
	// products
	private LinkedList<Product> products;

	// INSERIR REGEX PARA CHECAR SE OCORREU ERRO AQUI

	public Supplier(String name, Address addr, Contact cont,
			int legalPersonNumber) {
		super();
		this.name = name;
		this.addr = addr;
		this.cont = cont;
		this.legalPersonNumber = legalPersonNumber;
	}

	public Supplier() {
		super();
		supplier_id = 0;
		name = "";
		addr = new Address();
		cont = new Contact();
		legalPersonNumber = 0;
		products = new LinkedList<Product>();
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
	public int getLegalPersonNumber() {
		return legalPersonNumber;
	}

	/**
	 * 
	 * @param legalPersonNumber
	 */
	public void setLegalPersonNumber(int legalPersonNumber) {
		if (legalPersonNumber > 0) {
			this.legalPersonNumber = legalPersonNumber;
		}
	}

	/**
	 * 
	 * @return
	 */
	public LinkedList<Product> getProducts_id() {
		return products;
	}

	/**
	 * 
	 * @param products_id
	 */
	public void setProducts(LinkedList<Product> products) {
		if (products != null) {
			this.products = products;
		}
	}

	/**
	 * 
	 * @param product_id
	 */
	public void addProduct(Product product) {
		if (product != null) {
			products.add(product);
		}
	}

	/**
	 * 
	 * @return
	 */
	public Address getAddr() {
		return addr;
	}

	/**
	 * 
	 * @param addr
	 */
	public void setAddr(Address addr) {
		if (addr != null) {
			this.addr = addr;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Contact getCont() {
		return cont;
	}

	/**
	 * 
	 * @param cont
	 */
	public void setCont(Contact cont) {
		if (cont != null) {
			this.cont = cont;
		}
	}

	/**
	 * @return the supplier_id
	 */
	public int getSupplier_id() {
		return supplier_id;
	}

	/**
	 * @param supplier_id
	 *            the supplier_id to set
	 */
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
}
