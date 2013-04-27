package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Product;
import br.edu.utfpr.students.persistence.interfaces.ProductDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresProductDAO implements ProductDAO {
	PostgresProductDAO() {
	}

	@Override
	public int insertProduct(Product pro) throws ClassNotFoundException,
			SQLException {
		String sql = "INSERT INTO estoquedb.product(name, description, price, subcomponent) "
				+ "VALUES(?,?,?,?)";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, pro.getName());
		pstmt.setString(2, pro.getDescription());
		pstmt.setDouble(3, pro.getPrice());
		pstmt.setBoolean(4, pro.isNeedSubcomponents());

		int affectedRows = pstmt.executeUpdate();
		if (affectedRows == 0) {
			throw new SQLException("Creating address failed, no rows affected.");
		}
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if (generatedKeys.next()) {
			pro.setProduct_id(generatedKeys.getInt(1));
		} else {
			throw new SQLException(
					"Creating user failed, no generated key obtained.");
		}

		// se tiver subcomponente ira ser executado a parte abaixo
		if (pro.isNeedSubcomponents()) {
			insertRelationSubcomponent(pro);
		}
		// sera inserido a quantidade inicial do produto
		if (pro.getQuantity() > 0) {
			insertInitialQuantity(pro);
		}

		pstmt.close();
		connection.close();
		return 0;
	}

	public void insertRelationSubcomponent(Product pro)
			throws ClassNotFoundException, SQLException {
		Product subcomponent;
		String sql = "INSERT INTO estoquedb.parts(main_product_id, component_product_id)"
				+ "VALUES(?,?)";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		while (!pro.getSubcomponents().isEmpty()) {
			subcomponent = pro.getSubcomponents().removeFirst();
			pstmt.setInt(1, pro.getProduct_id());
			pstmt.setInt(2, subcomponent.getProduct_id());
			pstmt.executeUpdate();

		}
	}

	public void insertInitialQuantity(Product pro)
			throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO estoquedb.quantity(product_id, quantity, cost)"
				+ "VALUES(?,?,?)";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, pro.getProduct_id());
		pstmt.setInt(2, pro.getQuantity());
		pstmt.setDouble(3, pro.getCost());
		pstmt.executeUpdate();
	}

	@Override
	public boolean deleteProduct(Product pro) {
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
	public Product findProduct(Product pro) {
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
	public boolean updateProduct(Product pro) {
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
	public RowSet selectProductRS(Product pro) {
		// TODO Auto-generated method stub
		return null;
	}

}
