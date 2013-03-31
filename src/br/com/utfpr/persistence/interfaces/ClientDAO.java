package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Client;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ClientDAO {

    /**
     *
     * @param client
     * @return
     */
    public int insertClient(Client client);

    /**
     *
     * @param client
     * @return
     */
    public boolean deleteClient(Client client);

    /**
     *
     * @param client
     * @return
     */
    public Client findClient(Client client);

    /**
     *
     * @param client
     * @return
     */
    public boolean updateClient(Client client);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectClientRS(String condition);
    //public Collection selectClientTO(Client c);
}
