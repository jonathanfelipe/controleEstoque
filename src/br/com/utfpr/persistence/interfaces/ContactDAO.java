package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Contact;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ContactDAO {

    public int insertContact(Contact con);

    public boolean deleteContact(Contact con);

    public Contact findContact(Contact con);

    public boolean updateContact(Contact con);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectContactRS(String condition);
}
