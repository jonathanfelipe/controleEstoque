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
    //list of DAO types supported by the factory

    public static final int POSTGRES = 1;
    //add others later

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case POSTGRES:
                return new PostgresDAOFactory();
            default:
                return null;
        }
    }

    // implement these methods.
    public abstract ClientDAO getClientDAO();

    public abstract ProductDAO getProductDAO();

    public abstract ProviderDAO getProviderDAO();

    public abstract TransactionDAO getTransactionDAO();

    public abstract AddressDAO getAddressDAO();

    public abstract ContactDAO getContactDAO();
}
