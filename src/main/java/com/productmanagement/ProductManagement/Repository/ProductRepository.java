package com.productmanagement.ProductManagement.Repository;

import com.productmanagement.ProductManagement.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
