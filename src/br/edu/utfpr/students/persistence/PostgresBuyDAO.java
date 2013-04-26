/**
 * 
 */
package br.edu.utfpr.students.persistence;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Buy;
import br.edu.utfpr.students.persistence.interfaces.BuyDAO;

/**
 * @author raphael
 * 
 */
public class PostgresBuyDAO implements BuyDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.BuyDAO#insertBuy(br.edu.
	 * utfpr.students.model.Buy)
	 */
	@Override
	public int insertBuy(Buy buy) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.BuyDAO#deleteBuy(br.edu.
	 * utfpr.students.model.Buy)
	 */
	@Override
	public boolean deleteBuy(Buy buy) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.BuyDAO#findBuy(br.edu.utfpr
	 * .students.model.Buy)
	 */
	@Override
	public Buy findBuy(Buy buy) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.BuyDAO#updateBuy(br.edu.
	 * utfpr.students.model.Buy)
	 */
	@Override
	public boolean updateBuy(Buy buy) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.utfpr.students.persistence.interfaces.BuyDAO#selectBuyRS(br.edu
	 * .utfpr.students.model.Buy)
	 */
	@Override
	public RowSet selectBuyRS(Buy buy) {
		// TODO Auto-generated method stub
		return null;
	}

}
