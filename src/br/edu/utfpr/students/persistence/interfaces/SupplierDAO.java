/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import java.sql.SQLException;
import java.util.LinkedList;

import br.edu.utfpr.students.model.Supplier;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface SupplierDAO {

	/**
	 * 
	 * @param supp
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int insertSupplier(Supplier supp) throws ClassNotFoundException,
			SQLException;

	/**
	 * 
	 * @param supp
	 * @return
	 */
	public boolean deleteSupplier(Supplier supp);

	/**
	 * 
	 * @param supp
	 * @return
	 */
	public Supplier findSupplier(Supplier supp);

	/**
	 * 
	 * @param supp
	 * @return
	 */
	public boolean updateSupplier(Supplier supp);

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public LinkedList<Supplier> selectSupplierRS(String whereCondition);

	public void insertRelationSupplierProduct(int supplier_id, int product_id)
			throws ClassNotFoundException, SQLException;
}
