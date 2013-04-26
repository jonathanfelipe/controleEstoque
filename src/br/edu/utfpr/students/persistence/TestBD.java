/**
 * 
 */
package br.edu.utfpr.students.persistence;

import java.sql.SQLException;

import br.edu.utfpr.students.model.Contact;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;

//import java.sql.SQLException;

//import br.edu.utfpr.students.model.Address;
//import br.edu.utfpr.students.persistence.interfaces.AddressDAO;

/**
 * @author raphael
 * 
 */
public class TestBD {

	/**
	 * @param args
	 */
	/*
	 * public static void main(String args[]){ DAOFactory postDaoFactory =
	 * DAOFactory.getDAOFactory(DAOFactory.POSTGRES); ContactDAO conDao =
	 * postDaoFactory.getContactDAO(); Contact con = new Contact();
	 * con.setCellphone("9999999"); con.setEmail("raphael@gmail.com");
	 * con.setTelephone("98993222");
	 * 
	 * int id = 0; try { id = conDao.insertContact(con); } catch
	 * (ClassNotFoundException | SQLException e) {
	 * System.out.println("Deu merda"); e.printStackTrace(); }
	 * 
	 * System.out.println(id); }
	 */

	/*
	 * public static void main(String[] args) { //EXEMPLO DE MANIPULACAO DO
	 * BANCO DAOFactory postDaoFactory =
	 * DAOFactory.getDAOFactory(DAOFactory.POSTGRES); AddressDAO addDao =
	 * postDaoFactory.getAddressDAO(); Address address = new Address();
	 * address.setCity("Porto Velho"); address.setCountry("Brasil");
	 * address.setState("Rondonia");
	 * address.setStreet("Victor Ferreira Manahiba");
	 * address.setDistrict("Agenor de Carvalho"); address.setNumber(12345);
	 * address.setZipCode("99883772"); int newAddrID = 0; try { newAddrID =
	 * addDao.insertAddress(address); } catch (ClassNotFoundException |
	 * SQLException e) { System.out.println("Shit sometimes happens");
	 * e.printStackTrace(); return; } System.out.println(newAddrID);
	 * 
	 * }
	 */
}
