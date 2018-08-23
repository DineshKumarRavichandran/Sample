package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name ="productsample")

public class Products {

	@Id
	
	@Column(name = "product_id",nullable=false,insertable=false,updatable=false)
	private Integer product_id;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",nullable=false,insertable=false,updatable=false)
	private Integer id;
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private BrandNameEntry brandName;

	public Integer getId() {
		return id;
	}
	public Products setId(Integer id) {
		this.id = id;
		return this;
	}

	public BrandNameEntry getBrandName() {
		return brandName;
	}
	public Products setBrandName(BrandNameEntry brandName) {
		this.brandName = brandName;
		return this;
	}
	public Products() {
	}
}
