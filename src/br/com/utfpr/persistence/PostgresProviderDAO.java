package br.com.utfpr.persistence;

import br.com.utfpr.model.Provider;
import br.com.utfpr.persistence.interfaces.ProviderDAO;
import java.util.logging.Logger;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresProviderDAO implements ProviderDAO {

    PostgresProviderDAO() {
    }

    @Override
    public int insertProvider(Provider prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteProvider(Provider prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Provider findProvider(Provider prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProvider(Provider prov) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RowSet selectProviderRS(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private static final Logger LOG = Logger.getLogger(PostgresProviderDAO.class.getName());
}
