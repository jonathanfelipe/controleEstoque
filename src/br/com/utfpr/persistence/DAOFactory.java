package br.com.utfpr.persistence;

import br.com.utfpr.persistence.interfaces.AddressDAO;
import br.com.utfpr.persistence.interfaces.ClientDAO;
import br.com.utfpr.persistence.interfaces.ContactDAO;
import br.com.utfpr.persistence.interfaces.ProductDAO;
import br.com.utfpr.persistence.interfaces.ProviderDAO;
import br.com.utfpr.persistence.interfaces.TransactionDAO;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
//ABSTRACT FACTORY PATTERN
public abstract class DAOFactory {
    /**
     *
     */
    
    public static final int POSTGRES = 1;

    /**
     *
     * @param whichFactory
     * @return
     */
    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case POSTGRES:
                return new PostgresDAOFactory();
            default:
                return null;
        }
    }

    /**
     *
     * @return
     */
        public abstract ClientDAO getClientDAO();

    /**
     *
     * @return
     */
    public abstract ProductDAO getProductDAO();

    /**
     *
     * @return
     */
    public abstract ProviderDAO getProviderDAO();

    /**
     *
     * @return
     */
    public abstract TransactionDAO getTransactionDAO();

    /**
     *
     * @return
     */
    public abstract AddressDAO getAddressDAO();

    /**
     *
     * @return
     */
    public abstract ContactDAO getContactDAO();
}
