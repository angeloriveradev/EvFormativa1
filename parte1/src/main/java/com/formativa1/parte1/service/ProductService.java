package com.formativa1.parte1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formativa1.parte1.repository.ProductRepository;
import com.formativa1.parte1.model.Product;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getAll(){
        return repository.findAll();
    }


}
