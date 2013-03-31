package br.com.utfpr.persistence;

import br.com.utfpr.model.Transaction;
import br.com.utfpr.persistence.interfaces.TransactionDAO;
import java.util.logging.Logger;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresTransactionDAO implements TransactionDAO {

    PostgresTransactionDAO() {
    }

    @Override
    public int insertTransaction(Transaction tran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteTransaction(Transaction tran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Transaction findTransaction(Transaction tran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateTransaction(Transaction tran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RowSet selectTransactionRS(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static final Logger LOG = Logger.getLogger(PostgresTransactionDAO.class.getName());
}
