package br.com.utfpr.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Dao {

    protected Connection connection;

    protected void connect() throws ClassNotFoundException, SQLException {
        this.connection = new ConnectionFactory().getConnection();
    }

    protected void close() throws SQLException {
        this.connection.close();
    }

    protected ResultSet query(String sql) throws SQLException {
        ResultSet rset = null;

        PreparedStatement pstmt = connection.prepareStatement(sql);

        rset = pstmt.executeQuery();

        return rset;
        
    }
}