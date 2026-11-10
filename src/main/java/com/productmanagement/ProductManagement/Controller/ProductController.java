package com.productmanagement.ProductManagement.Controller;

import com.productmanagement.ProductManagement.DTO.ProductDTO;
import com.productmanagement.ProductManagement.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody ProductDTO productDTO){
return productService.addProduct(productDTO);
    }
}
