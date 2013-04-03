/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Supplier;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ProviderDAO {

    /**
     *
     * @param prov
     * @return
     */
    public int insertProvider(Supplier prov);

    /**
     *
     * @param prov
     * @return
     */
    public boolean deleteProvider(Supplier prov);

    /**
     *
     * @param prov
     * @return
     */
    public Supplier findProvider(Supplier prov);

    /**
     *
     * @param prov
     * @return
     */
    public boolean updateProvider(Supplier prov);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectProviderRS(String condition);
}
