package br.com.utfpr.persistence;

import br.com.utfpr.model.Supplier;
import br.com.utfpr.persistence.interfaces.ProviderDAO;
import java.util.logging.Logger;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresProviderDAO implements ProviderDAO {
    private static final Logger LOG = Logger.getLogger(PostgresProviderDAO.class.getName());

    PostgresProviderDAO() {
    }

    @Override
    public int insertProvider(Supplier prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteProvider(Supplier prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Supplier findProvider(Supplier prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProvider(Supplier prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RowSet selectProviderRS(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
