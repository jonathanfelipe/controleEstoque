/**
 * 
 */
package br.edu.utfpr.students.persistence.interfaces;

import java.util.LinkedList;

import br.edu.utfpr.students.model.Buy;

/**
 * @author raphael
 * 
 */
public interface BuyDAO {

	public int insertBuy(Buy buy);

	public boolean deleteBuy(Buy buy);

	public Buy findBuy(Buy buy);

	public boolean updateBuy(Buy buy);

	public LinkedList<Buy> selectBuyRS(String whereCondition);
}
