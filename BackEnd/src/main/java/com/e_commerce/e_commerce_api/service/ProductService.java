package com.e_commerce.e_commerce_api.service;

import com.e_commerce.e_commerce_api.model.Product;
import com.e_commerce.e_commerce_api.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        Optional<Product> optionalProduct = productRepo.findById(id);
        if (optionalProduct.isPresent()) {
            Product existingProduct = optionalProduct.get();
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setStockQuantity(updatedProduct.getStockQuantity());
            return productRepo.save(existingProduct);
        } else {
            throw new RuntimeException("Product not found with ID: " + id);
        }
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}
