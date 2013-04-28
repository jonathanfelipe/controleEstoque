package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Address;
import br.edu.utfpr.students.persistence.interfaces.AddressDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresAddressDAO implements AddressDAO {
	PostgresAddressDAO() {
	}

	@Override
	public int insertAddress(Address address) throws ClassNotFoundException,
			SQLException {
		String sql = "INSERT INTO estoquedb.address(city, state, country, district, street, number, zipcode)"
				+ " VALUES(?,?,?,?,?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, address.getCity());
		pstmt.setString(2, address.getState());
		pstmt.setString(3, address.getCountry());
		pstmt.setString(4, address.getDistrict());
		pstmt.setString(5, address.getStreet());
		pstmt.setInt(6, address.getNumber());
		pstmt.setString(7, address.getZipCode());
		int affectedRows = pstmt.executeUpdate();
		if (affectedRows == 0) {
			throw new SQLException("Creating address failed, no rows affected.");
		}
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if (generatedKeys.next()) {
			address.setAddrs_id(generatedKeys.getInt(1));
		} else {
			throw new SQLException(
					"Creating user failed, no generated key obtained.");
		}
		pstmt.close();
		connection.close();
		return address.getAddrs_id();
	}

	@Override
	public boolean deleteAddress(Address address) {
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
	public Address findAddress(Address address) {
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
	public boolean updateAddress(Address address) {
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
	public RowSet selectAddressRS(String whereCondition) {
		// TODO Auto-generated method stub
		return null;
	}
}
