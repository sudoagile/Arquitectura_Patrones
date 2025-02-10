package com.sudoagile.factorymethod;

import org.springframework.stereotype.Component;

@Component
public class ConcreteProductAFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
