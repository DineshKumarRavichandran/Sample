package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BrandNameEntry;
import com.example.demo.repository.BrandNameEntryRepository;


@RestController
public class BrandNameEntryController {

	@Autowired
	BrandNameEntryRepository brandNameEntryRepository;
	
	@PostMapping("/Brand/load")
	public List<BrandNameEntry> add(@RequestBody BrandNameEntry brandNameEntry){
	brandNameEntryRepository.save(brandNameEntry);
	return brandNameEntryRepository.findAll();
	}
	@GetMapping("/Brand/all")
	public List<BrandNameEntry> get(){
	return brandNameEntryRepository.findAll();
	}

}
