/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.persistence.interfaces;

import br.com.utfpr.model.Product;
import javax.sql.RowSet;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public interface ProductDAO {

    /**
     *
     * @param pro
     * @return
     */
    public int insertProduct(Product pro);

    /**
     *
     * @param pro
     * @return
     */
    public boolean deleteProduct(Product pro);

    /**
     *
     * @param pro
     * @return
     */
    public Product findProduct(Product pro);

    /**
     *
     * @param pro
     * @return
     */
    public boolean updateProduct(Product pro);

    /**
     *
     * @param condition
     * @return
     */
    public RowSet selectProductRS(String condition);
}
