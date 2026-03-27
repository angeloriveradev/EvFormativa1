package com.formativa1.parte1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formativa1.parte1.repository.ProductRepository;
import com.formativa1.parte1.model.Product;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getById(int id){
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product){
        return productRepository.addProduct(product);
    }

    public void delete(int id){
        productRepository.deleteProduct(id);
    }

}
