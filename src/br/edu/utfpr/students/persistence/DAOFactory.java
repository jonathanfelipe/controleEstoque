package br.edu.utfpr.students.persistence;

import br.edu.utfpr.students.persistence.interfaces.AddressDAO;
import br.edu.utfpr.students.persistence.interfaces.BuyDAO;
import br.edu.utfpr.students.persistence.interfaces.ClientDAO;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;
import br.edu.utfpr.students.persistence.interfaces.ProductDAO;
import br.edu.utfpr.students.persistence.interfaces.SellDAO;
import br.edu.utfpr.students.persistence.interfaces.SupplierDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
// ABSTRACT FACTORY PATTERN
public abstract class DAOFactory {
	/**
     *
     */

	public static final int POSTGRES = 1;

	/**
	 * 
	 * @param whichFactory
	 * @return
	 */
	public static DAOFactory getDAOFactory(int whichFactory) {
		switch (whichFactory) {
		case POSTGRES:
			return new PostgresDAOFactory();
		default:
			return null;
		}
	}

	public abstract BuyDAO getBuyDAO();

	public abstract SellDAO getSellDAO();

	/**
	 * 
	 * @return
	 */
	public abstract ClientDAO getClientDAO();

	/**
	 * 
	 * @return
	 */
	public abstract ProductDAO getProductDAO();

	/**
	 * 
	 * @return
	 */
	public abstract SupplierDAO getSupplierDAO();

	/**
	 * 
	 * @return
	 */
	public abstract AddressDAO getAddressDAO();

	/**
	 * 
	 * @return
	 */
	public abstract ContactDAO getContactDAO();
}
