package br.com.utfpr.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Dao {
    private static final Logger LOG = Logger.getLogger(Dao.class.getName());

    /**
     *
     */
    protected Connection connection;

    /**
     * this method will open a connection with the database through the
     * ConnectionFactory class
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    protected void connect() throws ClassNotFoundException, SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    /**
     * this method will close the connection with the database
     *
     * @throws SQLException
     */
    protected void close() throws SQLException {
        this.connection.close();
    }

    /**
     * this method will perform a query in the database and return the result
     *
     * @param sql
     * @return the result of the query
     * @throws SQLException
     */
    protected ResultSet query(String sql) throws SQLException {
        ResultSet rset = null;

        PreparedStatement pstmt = connection.prepareStatement(sql);

        rset = pstmt.executeQuery();

        return rset;

    }
}