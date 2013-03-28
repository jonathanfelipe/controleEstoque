package br.com.utfpr.model;

import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Product {
    private static final Logger LOG = Logger.getLogger(Product.class.getName());

    private int codProduct;
    private int codProvider;
    private double price;
    private int quantity;
    private String name;
    private String description;

    /**
     *
     * @return
     */
    public int getCodProduct() {
        return codProduct;
    }

    /**
     *
     * @param codProduct
     */
    public void setCodProduct(int codProduct) {
        this.codProduct = codProduct;
    }

    /**
     *
     * @return
     */
    public int getCodProvider() {
        return codProvider;
    }

    /**
     *
     * @param codProvider
     */
    public void setCodProvider(int codProvider) {
        this.codProvider = codProvider;
    }

    /**
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
