package com.example.product.management;

import java.util.logging.Logger;

public class ProductManager {
    private static final Logger LOGGER = Logger.getLogger(ProductManager.class.getName());

    private String[] products = new String[100];
    private int count = 0;

    public void addProduct(String name) {
        if (name == null) {
            LOGGER.warning("Product name is null"); 
        } else {
            products[count] = name;
            count++;
        }
    }

    public String findProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(name)) {
                return products[i];
            }
        }
        return null;
    }

    public void removeProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].equals(name)) {
                products[i] = products[count - 1];
                products[count - 1] = null;
                count--;
                break;
            }
        }
    }
}
