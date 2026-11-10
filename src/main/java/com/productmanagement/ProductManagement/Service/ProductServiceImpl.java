package com.productmanagement.ProductManagement.Service;

import com.productmanagement.ProductManagement.DTO.ProductDTO;
import com.productmanagement.ProductManagement.Model.Product;
import com.productmanagement.ProductManagement.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String addProduct(ProductDTO productDTO) {

        Product product=new Product(productDTO.getProductId(),productDTO.getProductName(),
        productDTO.getProductPrice(),productDTO.getProductQuantity(),productDTO.getProductCategory()
        ,productDTO.getProductDescription());
        productRepository.save(product);
        return "product added successfully";
    }


}
