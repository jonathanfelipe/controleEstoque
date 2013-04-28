package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Contact;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresContactDAO implements ContactDAO {
	PostgresContactDAO() {
	}

	@Override
	public int insertContact(Contact con) throws ClassNotFoundException,
			SQLException {
		String sql = "INSERT INTO estoquedb.contact(email, cellphone, telephone) VALUES(?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, con.getEmail());
		pstmt.setString(2, con.getCellphone());
		pstmt.setString(3, con.getTelephone());
		int affectedRows = pstmt.executeUpdate();
		if (affectedRows == 0) {
			throw new SQLException("Creating address failed, no rows affected.");
		}
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if (generatedKeys.next()) {
			con.setContact_id(generatedKeys.getInt(1));
		} else {
			throw new SQLException(
					"Creating user failed, no generated key obtained.");
		}
		pstmt.close();
		connection.close();

		return con.getContact_id();
	}

	@Override
	public boolean deleteContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public Contact findContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public boolean updateContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public RowSet selectContactRS(String whereCondition) {
		// TODO Auto-generated method stub
		return null;
	}

}
