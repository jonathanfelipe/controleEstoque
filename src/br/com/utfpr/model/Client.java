package br.com.utfpr.model;

import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Client {

    private static final Logger LOG = Logger.getLogger(Client.class.getName());
    private int client_id;
    private String name;
    private String SSN;
    private Address addr;
    private Contact cont;

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
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getSSN() {
        return SSN;
    }

    /**
     *
     * @param SSN
     */
    public void setSSN(String SSN) {
        this.SSN = SSN;
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
        this.addr = addr;
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
        this.cont = cont;
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
        this.client_id = client_id;
    }
}
