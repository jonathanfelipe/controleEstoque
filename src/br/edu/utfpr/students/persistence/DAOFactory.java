package br.edu.utfpr.students.persistence;

import br.edu.utfpr.students.persistence.interfaces.AddressDAO;
import br.edu.utfpr.students.persistence.interfaces.ClientDAO;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;
import br.edu.utfpr.students.persistence.interfaces.ProductDAO;
import br.edu.utfpr.students.persistence.interfaces.ProviderDAO;

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
	public abstract ProviderDAO getProviderDAO();

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
