package br.com.utfpr.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class ConnectionFactory {

    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String URL = "jdbc:postgresql://127.0.0.1:5432/";
    private static final String DATA_BASE = "estoquedb";

    public Connection getConnection() throws ClassNotFoundException,
            SQLException {

        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL + DATA_BASE, LOGIN, PASSWORD);
    }
    private static final Logger LOG = Logger.getLogger(ConnectionFactory.class.getName());
}