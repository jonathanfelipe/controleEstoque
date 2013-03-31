/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Provider;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ProviderDAO {

    public int insertProvider(Provider prov);

    public boolean deleteProvider(Provider prov);

    public Provider findProvider(Provider prov);

    public boolean updateProvider(Provider prov);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectProviderRS(String condition);
}
