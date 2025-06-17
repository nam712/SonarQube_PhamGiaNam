package com.example.product.management;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final String TABLET = "Tablet";

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct("Laptop");
        manager.addProduct("Smartphone");
        manager.addProduct(TABLET);

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Tìm sản phẩm: " + manager.findProduct("Smartphone"));
        }

        manager.removeProduct(TABLET);

        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info("Tìm sau khi xóa: " + manager.findProduct(TABLET));
        }
    }
}
