package com.formativa1.parte1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int idProduct;
    private String name;
    private int price;
    private String Category;

}
