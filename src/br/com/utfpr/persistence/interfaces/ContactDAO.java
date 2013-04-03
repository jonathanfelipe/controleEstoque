package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Contact;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ContactDAO {

    /**
     *
     * @param con
     * @return
     */
    public int insertContact(Contact con);

    /**
     *
     * @param con
     * @return
     */
    public boolean deleteContact(Contact con);

    /**
     *
     * @param con
     * @return
     */
    public Contact findContact(Contact con);

    /**
     *
     * @param con
     * @return
     */
    public boolean updateContact(Contact con);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectContactRS(String condition);
}
