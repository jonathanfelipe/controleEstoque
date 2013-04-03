package br.com.utfpr.model;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Contact {

    private static final Logger LOG = Logger.getLogger(Contact.class.getName());
    //chave primaria do objeto contact no db
    private int contact_id;
    private ArrayList<String> telephone;
    private ArrayList<String> cellphone;
    private ArrayList<String> email;

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
    public ArrayList<String> getTelephone() {
        return telephone;
    }

    /**
     *
     * @param telephone
     */
    public void setTelephone(ArrayList<String> telephone) {
        if (telephone != null) {
            this.telephone = telephone;
        }
    }

    /**
     *
     * @param telephone
     */
    public void addTelephone(String telephone) {
        if (!telephone.isEmpty()) {
            this.telephone.add(telephone);
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getCellphone() {
        return cellphone;
    }

    /**
     *
     * @param cellphone
     */
    public void setCellphone(ArrayList<String> cellphone) {
        this.cellphone = cellphone;
    }

    /**
     *
     * @param cellphone
     */
    public void addCellphone(String cellphone) {
        if (!cellphone.isEmpty()) {
            this.cellphone.add(cellphone);
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(ArrayList<String> email) {
        if (email != null) {
            this.email = email;
        }
    }

    /**
     *
     * @param email
     */
    public void addEmail(String email) {
        if (!email.isEmpty()) {
            this.email.add(email);
        }
    }
}
