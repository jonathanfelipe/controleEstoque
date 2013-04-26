package br.edu.utfpr.students.persistence.interfaces;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Sell;

public interface SellDAO {

	public int insertSell(Sell sell);

	public boolean deleteSell(Sell sell);

	public Sell findSell(Sell sell);

	public boolean updateSell(Sell sell);

	public RowSet selectSellRS(Sell sell);
}
