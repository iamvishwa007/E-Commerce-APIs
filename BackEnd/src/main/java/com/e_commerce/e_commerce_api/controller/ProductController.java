package com.e_commerce.e_commerce_api.controller;

import com.e_commerce.e_commerce_api.model.Product;
import com.e_commerce.e_commerce_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {

    @Autowired
    private ProductService productService;

   
}
