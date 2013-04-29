/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import java.sql.SQLException;
import java.util.LinkedList;


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
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Product findProduct(Product pro) throws ClassNotFoundException, SQLException;

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
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public LinkedList<Product> selectProductRS(String whereCondition) throws ClassNotFoundException, SQLException;

	public void insertRelationSubcomponent(Product pro)
			throws ClassNotFoundException, SQLException;

	public int insertInitialQuantity(Product pro)
			throws ClassNotFoundException, SQLException;

	public boolean updateQuantityOfProduct(Product pro)
			throws ClassNotFoundException, SQLException;
	public LinkedList<Product> selectSubcomponents(int product_id) 
			throws ClassNotFoundException, SQLException;
	
	public int selectQuantity(Product pro);
	
}
