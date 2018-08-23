package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brandname")
public class BrandNameEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	@Column(name = "Brand_Name")
	private String name;

	public String getName() {
		return name;
	}

	public BrandNameEntry setName(String name) {
		this.name = name;
		return this;
	}

	public BrandNameEntry() {
	}

	public Integer getId() {
		return id;
	}

	public BrandNameEntry setId(Integer id) {
		this.id = id;
		return this;
	}

}
