package br.edu.utfpr.students.persistence.interfaces;

import java.sql.SQLException;
import java.util.LinkedList;

import br.edu.utfpr.students.model.Product;
import br.edu.utfpr.students.model.Sell;

public interface SellDAO {

	public int insertSell(Sell sell) throws ClassNotFoundException,
			SQLException;

	public boolean deleteSell(Sell sell) throws ClassNotFoundException, SQLException;

	public Sell findSell(Sell sell);

	public boolean updateSell(Sell sell);

	public LinkedList<Sell> selectSellRS(String whereCondition) throws ClassNotFoundException, SQLException;

	public void insertSoldItems(Sell sell) throws ClassNotFoundException,
			SQLException;

	public void removeFromQuantity(Product pro) throws ClassNotFoundException,
			SQLException;
}
