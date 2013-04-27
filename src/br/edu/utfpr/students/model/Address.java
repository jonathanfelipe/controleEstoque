package br.edu.utfpr.students.model;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Address {

	private int addrs_id;
	private String zipCode;
	private String street;
	private String district;
	private String city;
	private String state;
	private String country;
	private int number;

	public Address() {
		super();
		addrs_id = 0;
		zipCode = "";
		street = "";
		district = "";
		city = "";
		state = "";
		country = "";
		number = 0;
	}

	/**
	 * 
	 * @return the zipcode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * 
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) {
		if (!zipCode.isEmpty()) {
			this.zipCode = zipCode;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * 
	 * @param street
	 */
	public void setStreet(String street) {
		if (!street.isEmpty()) {
			this.street = street;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * 
	 * @param district
	 */
	public void setDistrict(String district) {
		if (!district.isEmpty()) {
			this.district = district;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		if (!city.isEmpty()) {
			this.city = city;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		if (!state.isEmpty()) {
			this.state = state;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		if (!country.isEmpty()) {
			this.country = country;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		if (number >= 0) {
			this.number = number;
		}
	}

	/**
	 * @return the addrs_id
	 */
	public int getAddrs_id() {
		return addrs_id;
	}

	/**
	 * @param addrs_id
	 *            the addrs_id to set
	 */
	public void setAddrs_id(int addrs_id) {
		this.addrs_id = addrs_id;
	}
}
