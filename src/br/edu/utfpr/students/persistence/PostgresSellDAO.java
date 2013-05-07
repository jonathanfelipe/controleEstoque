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
import java.util.Calendar;
import java.util.LinkedList;

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
		String sql = "INSERT INTO estoquedb.sell(total, totalcost, selldate, client_id)"
				+ "VALUES(?,?,?,?);";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS);
		pstmt.setDouble(1, sell.getTotal());
		pstmt.setDouble(2, sell.getTotalCost());
		pstmt.setDate(3, new Date(sell.getDate().getTimeInMillis()));
		pstmt.setInt(4, sell.getClient_id());
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
	public boolean deleteSell(Sell sell) throws ClassNotFoundException, SQLException {
		boolean success = false;
		String sql = "DELETE FROM estoquedb.sell WHERE sell_id = ?;";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, sell.getSell_id());
		int affectedRows = pstmt.executeUpdate();
		if(affectedRows > 0){
			success = true;
		}
		pstmt.close();
		pstmt = null;
		sql = "DELETE FROM estoquedb.sold WHERE sell_id = ?;";
		pstmt = connection.prepareStatement(sql);
		affectedRows = pstmt.executeUpdate();
		if(affectedRows <= 0){
			success = false;
		}
		pstmt.close();
		connection.close();
		return success;
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

	public LinkedList<Sell> selectSellRS(String whereCondition) throws ClassNotFoundException, SQLException {
		LinkedList<Sell> sales = new LinkedList<Sell>();
		String sql = "SELECT * FROM estoquedb.sell WHERE ?;";
		Connection connection = PostgresDAOFactory.createConnection();
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, whereCondition);
		ResultSet rset = pstmt.executeQuery();
		Sell sell; 
		while(rset.next()){
			sell = new Sell();
			sell.setSell_id(rset.getInt("sell_id"));
			sell.setClient_id(rset.getInt("client_id"));
			sell.setDate(Calendar.getInstance());
			sell.getDate().setTime(rset.getDate("selldate"));
			sell.setTotal(rset.getDouble("total"));
			sell.setTotalCost(rset.getDouble("totalcost"));
					
			String sqlsold = "SELECT product_id, quantity, cost, price FROM estoquedb.sold WHERE sell_id = ?;";
			PreparedStatement local = connection.prepareStatement(sqlsold);
			local.setInt(1, sell.getSell_id());
			ResultSet rlocal = local.executeQuery();
			Product p;
			LinkedList<Product> lp = new LinkedList<Product>();
			while(rlocal.next()){
				p = new Product();
				p.setProduct_id(rlocal.getInt("product_id"));
				p.setQuantity(rlocal.getInt("quantity"));
				p.setCost(rlocal.getDouble("cost"));
				p.setPrice(rlocal.getDouble("price"));
				lp.addLast(p);
			}
			rlocal.close();
			sell.setProductList(lp);
			sales.addLast(sell);
		}
		rset.close();
		pstmt.close();
		connection.close();
		return sales;
	}

}
