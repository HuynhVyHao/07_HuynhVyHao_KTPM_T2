package com.demo.huynhvyhao_product.service;



import java.util.List;

import com.demo.huynhvyhao_product.entity.Product;



public interface ProductSevice {
    public List<Product> getAllProduct();
    public void addProduct(Product product);

}
