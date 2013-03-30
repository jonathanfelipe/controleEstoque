package br.com.utfpr.model;

import java.util.logging.Logger;

/**
 *
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class Product {

    private static final Logger LOG = Logger.getLogger(Product.class.getName());
    private int product_id;
    //PENSAR MELHOR - TALVEZ NAO SEJA NECESSARIO TER O PROVIDER ID
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
        if (product_id > 0) {
            this.product_id = product_id;
        }
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
        if (provider_id > 0) {
            this.provider_id = provider_id;
        }
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
        if (price > 0.0) {
            this.price = price;
        }

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
        if (!name.isEmpty()) {
            this.name = name;
        }
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
        if (!description.isEmpty()) {
            this.description = description;
        }
    }
}
