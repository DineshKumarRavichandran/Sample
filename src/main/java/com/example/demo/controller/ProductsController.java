package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class ProductsController {

	@Autowired
	ProductsRepository productsRepository;
	
	@PostMapping("/Product/load")
	@ApiOperation("Post Product Details")
	public List<Products> add(@RequestBody Products products){
		productsRepository.save(products);
		return productsRepository.findAll();
	}
	
	@GetMapping("/Product/all")
	@ApiOperation("Get Product Details")
	public List<Products> show(){
		return productsRepository.findAll();
	}
	
}