package br.edu.utfpr.students.persistence;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Contact;
import br.edu.utfpr.students.persistence.interfaces.ContactDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresContactDAO implements ContactDAO {
	PostgresContactDAO() {
	}

	@Override
	public int insertContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public boolean deleteContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public Contact findContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public boolean updateContact(Contact con) {
		throw new UnsupportedOperationException("Not supported yet."); // To
																		// change
																		// body
																		// of
																		// generated
																		// methods,
																		// choose
																		// Tools
																		// |
																		// Templates.
	}

	@Override
	public RowSet selectContactRS(Contact con) {
		// TODO Auto-generated method stub
		return null;
	}

}
