package br.com.utfpr.persistence;

import br.com.utfpr.model.Contact;
import br.com.utfpr.persistence.interfaces.ContactDAO;
import java.util.logging.Logger;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresContactDAO implements ContactDAO {
    private static final Logger LOG = Logger.getLogger(PostgresContactDAO.class.getName());

    PostgresContactDAO() {
    }

    @Override
    public int insertContact(Contact con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteContact(Contact con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contact findContact(Contact con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateContact(Contact con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RowSet selectContactRS(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
