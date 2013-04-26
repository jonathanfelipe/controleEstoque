package br.edu.utfpr.students.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
class PostgresDAOFactory extends DAOFactory {

	public static final String DRIVER = "org.postgresql.Driver";
	public static final String URL = "jdbc:postgresql://127.0.0.1:5432/";
	public static final String DATABASE = "controle";
	public static final String LOGIN = "raphael";
	public static final String PASSWORD = "postgres";

	public static Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL + DATABASE, LOGIN, PASSWORD);
	}

	PostgresDAOFactory() {
	}

	@Override
	public ClientDAO getClientDAO() {
		return new PostgresClientDAO();
	}

	@Override
	public ProductDAO getProductDAO() {
		return new PostgresProductDAO();
	}

	@Override
	public AddressDAO getAddressDAO() {
		return new PostgresAddressDAO();

	}

	@Override
	public ContactDAO getContactDAO() {
		return new PostgresContactDAO();
	}

	@Override
	public SupplierDAO getSupplierDAO() {
		return new PostgresSupplierDAO();
	}

	@Override
	public BuyDAO getBuyDAO() {
		return new PostgresBuyDAO();
	}

	@Override
	public SellDAO getSellDAO() {
		return new PostgresSellDAO();
	}
}
