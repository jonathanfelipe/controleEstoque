package br.edu.utfpr.students.persistence.interfaces;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Client;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ClientDAO {

	/**
	 * 
	 * @param client
	 * @return
	 */
	public int insertClient(Client client);

	/**
	 * 
	 * @param client
	 * @return
	 */
	public boolean deleteClient(Client client);

	/**
	 * 
	 * @param client
	 * @return
	 */
	public Client findClient(Client client);

	/**
	 * 
	 * @param client
	 * @return
	 */
	public boolean updateClient(Client client);

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public RowSet selectClientRS(Client client);
	// public Collection selectClientTO(Client c);
}
