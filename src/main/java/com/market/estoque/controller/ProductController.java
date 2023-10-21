package com.market.estoque.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.market.estoque.entities.Department;
import com.market.estoque.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects() {
        Department d1 = new Department(1L, "Grãos");
        Department d2 = new Department(2L, "Lacticinios");
        Department d3 = new Department(3L,"Bebidas");
        Department d4 = new Department(4L,"Hortifruti");
        Department d5 = new Department(5L, "Açougue");

        Product p1 = new Product(1L,"Arroz",20.00,d1);
        Product p2 = new Product(2L,"Feijão",6.00,d1);
        Product p3 = new Product(3L,"Leite Integral",4.00,d2);
        Product p4 = new Product(4L,"Água",2.00,d3);
        Product p5 = new Product(5L,"Alface",2.00,d4);
        Product p6 = new Product(6L,"Picanha kg", 70.00,d5);

        List<Product> list = Arrays.asList(p1, p2, p3, p4, p5, p6);

        return list;

    }

}
