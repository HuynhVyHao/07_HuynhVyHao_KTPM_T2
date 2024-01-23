package com.demo.huynhvyhao_product.reponsity;


import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.huynhvyhao_product.entity.Product;

public interface ProductReponsity extends JpaRepository<Product,Integer> {
}
