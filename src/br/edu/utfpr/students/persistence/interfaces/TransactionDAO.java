/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Transaction;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface TransactionDAO {

	/**
	 * 
	 * @param tran
	 * @return
	 */
	public int insertTransaction(Transaction tran);

	/**
	 * 
	 * @param tran
	 * @return
	 */
	public boolean deleteTransaction(Transaction tran);

	/**
	 * 
	 * @param tran
	 * @return
	 */
	public Transaction findTransaction(Transaction tran);

	/**
	 * 
	 * @param tran
	 * @return
	 */
	public boolean updateTransaction(Transaction tran);

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public RowSet selectTransactionRS(String condition);
}
