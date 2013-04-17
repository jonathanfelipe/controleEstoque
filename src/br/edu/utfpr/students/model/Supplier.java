package br.edu.utfpr.students.model;

import java.util.ArrayList;

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
	// tabela separada many-to-many
	private ArrayList<Product> products;

	// INSERIR REGEX PARA CHECAR SE OCORREU ERRO AQUI

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
	public ArrayList<Product> getProducts_id() {
		return products;
	}

	/**
	 * 
	 * @param products_id
	 */
	public void setProducts(ArrayList<Product> products) {
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
			this.products.add(product);
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
