/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import javax.sql.RowSet;

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
	 */
	public int insertSupplier(Supplier supp);

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
	public RowSet selectSupplierRS(Supplier supp);
}
