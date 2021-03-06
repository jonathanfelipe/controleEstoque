package br.edu.utfpr.students.model;

import java.util.Calendar;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Client {

	private int client_id;
	private String name;
	private String ssn;
	private Calendar birthdate;
	// quando criar cliente fazer primeiro a insercao do endereco e do contato,
	// pois eles retornaram os ids dos objetos para serem armazenados na tabela
	// do cliente
	private Address addr;
	private Contact cont;

	public Client(String name, String ssn, Calendar birthdate, Address addr,
			Contact cont) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.birthdate = birthdate;
		this.addr = addr;
		this.cont = cont;
	}

	public Client() {
		super();
		client_id = 0;
		name = "";
		ssn = "";
		birthdate = null;
		addr = new Address();
		cont = new Contact();
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {

		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * 
	 * @param ssn
	 */
	public void setSsn(String ssn) {
		if (!ssn.isEmpty()) {
			this.ssn = ssn;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Address getAddr() {
		return addr;
	}

	/**
	 * 
	 * @param addr
	 */
	public void setAddr(Address addr) {
		if (addr != null) {
			this.addr = addr;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Contact getCont() {
		return cont;
	}

	/**
	 * 
	 * @param cont
	 */
	public void setCont(Contact cont) {
		if (cont != null) {
			this.cont = cont;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * 
	 * @param client_id
	 */
	public void setClient_id(int client_id) {
		if (client_id > 0) {
			this.client_id = client_id;
		}
	}

	/**
	 * @return the birthdate
	 */
	public Calendar getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate
	 *            the birthdate to set
	 */
	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}
}
