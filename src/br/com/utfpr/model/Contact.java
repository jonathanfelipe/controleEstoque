package br.com.utfpr.model;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Contact {
    private static final Logger LOG = Logger.getLogger(Contact.class.getName());

    //codigo (chave primaria) do sujeito que tem esse contato como objeto
    private int cod;
    //chave primaria do objeto contact no db
    private int codContact;
    private ArrayList<String> telephone;
    private ArrayList<String> cellphone;
    private ArrayList<String> email;

    /**
     *
     * @return
     */
    public int getCod() {
        return cod;
    }

    /**
     *
     * @param cod
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     *
     * @return
     */
    public int getCodContact() {
        return codContact;
    }

    /**
     *
     * @param codContact
     */
    public void setCodContact(int codContact) {
        this.codContact = codContact;
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
