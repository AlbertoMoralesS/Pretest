package com.pretest.BYPreTest.models;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public List<Product> listProducts(){
        List<Product> productos = new ArrayList<>();

        Product producto1 = new Product();
        producto1.setProductID("product2");
        producto1.setProductName("Trousers");
        producto1.setUnitOfMeasure("EACH");
        producto1.setLaunchDate("2021-02-19");

        Product producto2 = new Product();
        producto2.setProductID("product1");
        producto2.setProductName("Shirt");
        producto2.setUnitOfMeasure("EACH");
        producto2.setLaunchDate("2021-02-21");

        Product producto3 = new Product();
        producto3.setProductID("product3");
        producto3.setProductName("Tie");
        producto3.setUnitOfMeasure("EACH");
        producto3.setLaunchDate("2021-02-22");

        Product producto4 = new Product();
        producto4.setProductID("product4");
        producto4.setProductName("Tie");
        producto4.setUnitOfMeasure("EACH");
        producto4.setLaunchDate("2021-02-24");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);

        return productos;
    }
    }
