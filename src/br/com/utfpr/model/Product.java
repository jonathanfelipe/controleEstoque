package br.com.utfpr.model;

import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Product {

    private static final Logger LOG = Logger.getLogger(Product.class.getName());
    private int product_id;
    private int provider_id;
    private double price;
    private int quantity;
    private String name;
    private String description;

    /**
     *
     * @return
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     *
     * @param product_id
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     *
     * @return
     */
    public int getProvider_id() {
        return provider_id;
    }

    /**
     *
     * @param provider_id
     */
    public void setProvider_id(int provider_id) {
        this.provider_id = provider_id;
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
