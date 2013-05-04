/**
 * 
 */
package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Product;
import br.edu.utfpr.students.model.Sell;
import br.edu.utfpr.students.persistence.interfaces.ProductDAO;
import br.edu.utfpr.students.persistence.interfaces.SellDAO;

/**
 * @author raphael
 * 
 */
public class PostgresSellDAO implements SellDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.SellDAO#insertSell(br.edu
	 * .utfpr.students.model.Sell)
	 */
	@Override
	public int insertSell(Sell sell) throws ClassNotFoundException,
			SQLException {
		// TODO VERIFICAR SE A QUANTIDADE SUFICIENTE PARA VENDA SUBPRODUTOS
		// TODO ADICIONAR TODOS OS SUBPRODUTOS A VENDA
		String sql = "INSERT INTO estoquedb.sell(total, totalcost, totalprofit, selldate, client_id)"
				+ "VALUES(?,?,?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setDouble(1, sell.getTotal());
		pstmt.setDouble(2, sell.getTotalCost());
		pstmt.setDouble(3, sell.getTotalEarn());
		pstmt.setDate(4, new Date(sell.getDate().getTimeInMillis()));
		pstmt.setInt(5, sell.getClient_id());
		int affectedRows = pstmt.executeUpdate();
		if (affectedRows == 0) {
			throw new SQLException("Creating address failed, no rows affected.");
		}
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if (generatedKeys.next()) {
			sell.setSell_id(generatedKeys.getInt(1));
		} else {
			throw new SQLException(
					"Creating user failed, no generated key obtained.");
		}

		if (sell.getSell_id() > 0) {
			insertSoldItems(sell);
		}

		pstmt.close();
		connection.close();
		return sell.getSell_id();
	}

	@Override
	public void insertSoldItems(Sell sell) throws ClassNotFoundException,
			SQLException {
		Product item;
		String sql = "INSERT INTO estoquedb.sold(sell_id, product_id, quantity, cost, price) VALUES(?,?,?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		while (!sell.getProductList().isEmpty()) {
			item = sell.getProductList().removeFirst();
			pstmt.setInt(1, sell.getSell_id());
			pstmt.setInt(2, item.getProduct_id());
			pstmt.setInt(3, item.getQuantity());
			pstmt.setDouble(4, item.getCost());
			pstmt.setDouble(5, item.getPrice());
			pstmt.executeUpdate();
			removeFromQuantity(item);
		}

		pstmt.close();
		connection.close();
	}

	@Override
	public void removeFromQuantity(Product pro) throws ClassNotFoundException,
			SQLException {
		DAOFactory daof = DAOFactory.getDAOFactory(DAOFactory.POSTGRES);
		ProductDAO proDao = daof.getProductDAO();
		proDao.updateQuantityOfProduct(pro);
	}

	public void insertBilling(Sell sell) {
		// TODO
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.SellDAO#deleteSell(br.edu
	 * .utfpr.students.model.Sell)
	 */
	@Override
	public boolean deleteSell(Sell sell) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.SellDAO#findSell(br.edu.
	 * utfpr.students.model.Sell)
	 */
	@Override
	public Sell findSell(Sell sell) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.SellDAO#updateSell(br.edu
	 * .utfpr.students.model.Sell)
	 */
	@Override
	public boolean updateSell(Sell sell) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.SellDAO#selectSellRS(br.
	 * edu.utfpr.students.model.Sell)
	 */
	@Override
	public RowSet selectSellRS(String whereCondition) {
		// TODO Auto-generated method stub
		return null;
	}

}
