package com.formativa1.parte1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.formativa1.parte1.model.Product;

@Repository
public class ProductRepository {

    private List<Product>inventory = new ArrayList<>();
    private ProductRepository(){
        inventory.add(new Product(101, "Laptop XPS", 1200, "Electrónica"));
        inventory.add(new Product(102, "Silla Gamer", 250, "Muebles"));
        inventory.add(new Product(103, "Monitor 4K", 350, "Electrónica"));
        inventory.add(new Product(104, "Teclado Mecánico", 85, "Periféricos"));
        inventory.add(new Product(105, "Auriculares BT", 120, "Audio"));
        inventory.add(new Product(106, "Escritorio Pro", 450, "Muebles"));
    }

    public List<Product> findAll(){
        return inventory;
    }

    public Product addProduct(Product product){
        inventory.add(product);
        return product;
    }

    public boolean deleteProduct(int idProduct){
        return inventory.removeIf(p -> p.getIdProduct() == idProduct);
    }

}
