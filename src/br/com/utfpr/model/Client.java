package br.com.utfpr.model;

import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Client {
    private static final Logger LOG = Logger.getLogger(Client.class.getName());

    private String name;
    private String SSN;
    private Address addr;
    private int codClient;

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
    public int getCodClient() {
        return codClient;
    }

    /**
     *
     * @param codClient
     */
    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }
    
    
}
