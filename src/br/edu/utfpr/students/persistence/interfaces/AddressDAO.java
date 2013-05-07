/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.students.persistence.interfaces;

import java.sql.SQLException;
import java.util.LinkedList;

import br.edu.utfpr.students.model.Address;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface AddressDAO {

	/**
	 * 
	 * @param address
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public int insertAddress(Address address) throws ClassNotFoundException,
			SQLException;

	/**
	 * 
	 * @param address
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean deleteAddress(Address address) throws ClassNotFoundException, SQLException;

	/**
	 * 
	 * @param address
	 * @return
	 */
	public Address findAddress(Address address);

	/**
	 * 
	 * @param address
	 * @return
	 */
	public boolean updateAddress(Address address);

	/**
	 * 
	 * @param condition
	 * @return
	 */
	public LinkedList<Address> selectAddressRS(String whereCondition);
}
