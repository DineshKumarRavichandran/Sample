package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BrandNameEntry;

@Repository
public interface BrandNameEntryRepository extends JpaRepository<BrandNameEntry, Integer>{

}
