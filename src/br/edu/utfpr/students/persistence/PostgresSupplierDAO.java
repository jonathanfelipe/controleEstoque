package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Supplier;
import br.edu.utfpr.students.persistence.interfaces.AddressDAO;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;
import br.edu.utfpr.students.persistence.interfaces.SupplierDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresSupplierDAO implements SupplierDAO {
	PostgresSupplierDAO() {
	}

	@Override
	public int insertSupplier(Supplier supp) throws ClassNotFoundException,
			SQLException {
		DAOFactory postDaoFactory = DAOFactory
				.getDAOFactory(DAOFactory.POSTGRES);
		int idAdd = -1;
		int idCont = -1;
		if (supp.getAddr() != null) {
			AddressDAO addDao = postDaoFactory.getAddressDAO();
			idAdd = addDao.insertAddress(supp.getAddr());

		}
		if (supp.getCont() != null) {
			ContactDAO conDao = postDaoFactory.getContactDAO();
			idCont = conDao.insertContact(supp.getCont());
		}
		String sql = "INSERT INTO estoquedb.supplier(name, legal_person_number, address_id, contact_id)"
				+ " VALUES(?,?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, supp.getName());
		pstmt.setInt(2, supp.getLegalPersonNumber());
		pstmt.setInt(3, idAdd);
		pstmt.setInt(4, idCont);

		int affectedRows = pstmt.executeUpdate();
		if (affectedRows == 0) {
			throw new SQLException("Creating address failed, no rows affected.");
		}
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if (generatedKeys.next()) {
			supp.setSupplier_id(generatedKeys.getInt(1));
		} else {
			throw new SQLException(
					"Creating user failed, no generated key obtained.");
		}
		pstmt.close();
		connection.close();
		return supp.getSupplier_id();
	}

	@Override
	public void insertRelationSupplierProduct(int supplier_id, int product_id)
			throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO estoquedb.provides(supplier_id, product_id) "
				+ "VALUES(?,?)";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, supplier_id);
		pstmt.setInt(2, product_id);
		pstmt.executeUpdate();

	}

	@Override
	public boolean deleteSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Supplier findSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RowSet selectSupplierRS(String whereCondition) {
		// TODO Auto-generated method stub
		return null;
	}

}
