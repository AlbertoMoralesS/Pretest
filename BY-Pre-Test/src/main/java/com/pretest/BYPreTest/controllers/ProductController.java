package com.pretest.BYPreTest.controllers;

import com.pretest.BYPreTest.models.Product;
import com.pretest.BYPreTest.models.ProductList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {
    @RequestMapping(value = "sortProducts")
    public List<Product> sortProducts(){
        ProductList listaproductos = new ProductList();
        List<Product> lista = listaproductos.listProducts();
        return lista.stream().sorted(Comparator.comparing(Product::getProductID).reversed()).collect(Collectors.toList());
    }
}
