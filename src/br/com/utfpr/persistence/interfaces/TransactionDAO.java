/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Transaction;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface TransactionDAO {

    public int insertTransaction(Transaction tran);

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
