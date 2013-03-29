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
        this.contact_id = contact_id;
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
        this.telephone = telephone;
    }
    
    public void addTelephone(String telephone) {
        this.telephone.add(telephone);
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
    
    public void addCellphone(String cellphone) {
        this.cellphone.add(cellphone);
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
        this.email = email;
    }
}
