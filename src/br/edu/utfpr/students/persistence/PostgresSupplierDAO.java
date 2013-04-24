package br.edu.utfpr.students.persistence;

import javax.sql.RowSet;

import br.edu.utfpr.students.model.Supplier;
import br.edu.utfpr.students.persistence.interfaces.SupplierDAO;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
class PostgresSupplierDAO implements SupplierDAO {
	PostgresSupplierDAO() {
	}

	@Override
	public int insertSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Supplier findSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateSupplier(Supplier supp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RowSet selectSupplierRS(Supplier supp) {
		// TODO Auto-generated method stub
		return null;
	}

}
