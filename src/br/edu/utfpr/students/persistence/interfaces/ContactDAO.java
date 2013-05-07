package br.edu.utfpr.students.persistence.interfaces;

import java.sql.SQLException;
import java.util.LinkedList;

import br.edu.utfpr.students.model.Contact;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ContactDAO {

	/**
	 * 
	 * @param con
	 * @return
	 * @throws
	 * @throws ClassNotFoundException
	 */
	public int insertContact(Contact con) throws ClassNotFoundException,
			SQLException;

	/**
	 * 
	 * @param con
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean deleteContact(Contact con) throws ClassNotFoundException, SQLException;

	/**
	 * 
	 * @param con
	 * @return
	 */
	public Contact findContact(Contact con);

	/**
	 * 
	 * @param con
	 * @return
	 */
	public boolean updateContact(Contact con);

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public LinkedList<Contact> selectContactRS(String whereCondition);
}
