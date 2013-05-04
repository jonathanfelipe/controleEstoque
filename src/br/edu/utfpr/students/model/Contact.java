package br.edu.utfpr.students.model;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Contact {

	// chave primaria do objeto contact no db
	private int contact_id;
	private String telephone;
	private String cellphone;
	private String email;

	public Contact(String telephone, String cellphone, String email) {
		super();
		this.telephone = telephone;
		this.cellphone = cellphone;
		this.email = email;
	}

	public Contact() {
		contact_id = 0;
		telephone = "";
		cellphone = "";
		email = "";
	}

	/**
	 * 
	 * @return
	 */
	public int getContact_id() {
		return contact_id;
	}

	/**
	 * 
	 * @param contact_id
	 */
	public void setContact_id(int contact_id) {
		if (contact_id > 0) {
			this.contact_id = contact_id;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * 
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		if (telephone != null) {
			this.telephone = telephone;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		if (email != null) {
			this.email = email;
		}
	}

	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone
	 *            the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

}
