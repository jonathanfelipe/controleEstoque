package br.com.utfpr.persistence;

import br.com.utfpr.persistence.interfaces.AddressDAO;
import br.com.utfpr.persistence.interfaces.ClientDAO;
import br.com.utfpr.persistence.interfaces.ContactDAO;
import br.com.utfpr.persistence.interfaces.ProductDAO;
import br.com.utfpr.persistence.interfaces.ProviderDAO;
import br.com.utfpr.persistence.interfaces.TransactionDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresDAOFactory extends DAOFactory {

    public static final String DRIVER = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://127.0.0.1:5432/";
    public static final String DATABASE = "estoquedb";
    public static final String LOGIN = "postgres";
    public static final String PASSWORD = "postgres";
    private static final Logger LOG = Logger.getLogger(PostgresDAOFactory.class.getName());

    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL + DATABASE, LOGIN, PASSWORD);
    }

    PostgresDAOFactory() {
    }

    @Override
    public ClientDAO getClientDAO() {
        return new PostgresClientDAO();
    }

    @Override
    public ProductDAO getProductDAO() {
        return new PostgresProductDAO();
    }

    @Override
    public ProviderDAO getProviderDAO() {
        return new PostgresProviderDAO();
    }

    @Override
    public TransactionDAO getTransactionDAO() {
        return new PostgresTransactionDAO();
    }

    @Override
    public AddressDAO getAddressDAO() {
        return new PostgresAddressDAO();

    }

    @Override
    public ContactDAO getContactDAO() {
        return new PostgresContactDAO();
    }
}
