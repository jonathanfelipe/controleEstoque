package br.com.utfpr.model;

import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Address {

    private static final Logger LOG = Logger.getLogger(Address.class.getName());
    private String zipCode;
    private String street;
    private String district;
    private String city;
    private String state;
    private String country;
    private int number;

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
        if(!country.isEmpty()) {
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
        if(number >= 0){
        this.number = number;
    }}
}
