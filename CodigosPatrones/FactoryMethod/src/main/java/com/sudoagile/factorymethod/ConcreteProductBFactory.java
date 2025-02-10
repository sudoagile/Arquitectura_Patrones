package com.sudoagile.factorymethod;

import org.springframework.stereotype.Component;

@Component
public class ConcreteProductBFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}