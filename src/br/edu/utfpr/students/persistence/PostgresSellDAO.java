/**
 * 
 */
package br.edu.utfpr.students.persistence;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Sell;
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
	public int insertSell(Sell sell) {
		// TODO Auto-generated method stub
		return 0;
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
	public RowSet selectSellRS(Sell sell) {
		// TODO Auto-generated method stub
		return null;
	}

}
