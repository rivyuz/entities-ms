package com.riviewz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salon_brand")
public class SalonBrand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column(name="brand_name")
	private String brand;
	
	@Column(name="city_name")
	private String city;

	public SalonBrand() {
	}

	public SalonBrand(int id, String brand, String city) {
		this.id = id;
		this.brand = brand;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
