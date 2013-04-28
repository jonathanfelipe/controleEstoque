package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Client;
import br.edu.utfpr.students.persistence.interfaces.AddressDAO;
import br.edu.utfpr.students.persistence.interfaces.ClientDAO;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresClientDAO implements ClientDAO {
	PostgresClientDAO() {
	}

	@Override
	public int insertClient(Client client) throws ClassNotFoundException,
			SQLException {
		DAOFactory postDaoFactory = DAOFactory
				.getDAOFactory(DAOFactory.POSTGRES);
		int idAdd = -1;
		int idCont = -1;
		if (client.getAddr() != null) {
			AddressDAO addDao = postDaoFactory.getAddressDAO();
			idAdd = addDao.insertAddress(client.getAddr());

		}
		if (client.getCont() != null) {
			ContactDAO conDao = postDaoFactory.getContactDAO();
			idCont = conDao.insertContact(client.getCont());
		}
		String sql = "INSERT INTO estoquedb.client(name, ssn, address_id, contact_id, birthdate)"
				+ " VALUES(?,?,?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, client.getName());
		pstmt.setString(2, client.getSsn());
		pstmt.setInt(3, idAdd);
		pstmt.setInt(4, idCont);
		pstmt.setDate(5, new Date(client.getBirthdate().getTimeInMillis()));
		int affectedRows = pstmt.executeUpdate();
		if (affectedRows == 0) {
			throw new SQLException("Creating address failed, no rows affected.");
		}
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if (generatedKeys.next()) {
			client.setClient_id(generatedKeys.getInt(1));
		} else {
			throw new SQLException(
					"Creating user failed, no generated key obtained.");
		}
		pstmt.close();
		connection.close();

		return client.getClient_id();
	}

	@Override
	public boolean deleteClient(Client client) {
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
	public Client findClient(Client client) {
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
	public boolean updateClient(Client client) {
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
	public RowSet selectClientRS(String whereCondition) {
		// TODO Auto-generated method stub
		return null;
	}
}
