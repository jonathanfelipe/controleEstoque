/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import java.sql.SQLException;

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
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int insertProduct(Product pro) throws ClassNotFoundException,
			SQLException;

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
