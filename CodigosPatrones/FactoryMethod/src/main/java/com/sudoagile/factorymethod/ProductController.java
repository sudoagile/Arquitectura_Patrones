package com.sudoagile.factorymethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductFactory productAFactory;
    private final ProductFactory productBFactory;

    public ProductController(ConcreteProductAFactory productAFactory, ConcreteProductBFactory productBFactory) {
        this.productAFactory = productAFactory;
        this.productBFactory = productBFactory;
    }

    @GetMapping("/a")
    public String getProductA() {
        return productAFactory.createProduct().getDescription();
    }

    @GetMapping("/b")
    public String getProductB() {
        return productBFactory.createProduct().getDescription();
    }
}
