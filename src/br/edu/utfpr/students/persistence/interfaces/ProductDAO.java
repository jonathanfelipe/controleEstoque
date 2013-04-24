/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Product;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ProductDAO {

	/**
	 * 
	 * @param pro
	 * @return
	 */
	public int insertProduct(Product pro);

	/**
	 * 
	 * @param pro
	 * @return
	 */
	public boolean deleteProduct(Product pro);

	/**
	 * 
	 * @param pro
	 * @return
	 */
	public Product findProduct(Product pro);

	/**
	 * 
	 * @param pro
	 * @return
	 */
	public boolean updateProduct(Product pro);

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public RowSet selectProductRS(Product pro);
}
