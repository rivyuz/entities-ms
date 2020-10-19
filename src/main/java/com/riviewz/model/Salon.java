package com.riviewz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salon_list")
public class Salon extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String indxCatg;
	
	@Column(name = "name")
	private String brand;	
	
	@Column(name = "salon_name")
	private String name;

	@Column(name = "type")
	private String type;
	
	private String address1;

	private String address2;

	@Column(name = "city_name")
	private String cityName;

	private String pinCode;

	@Column(name = "contact_number1")
	private String phNum1;

	@Column(name = "contact_number2")
	private String phNum2;

	@Column(name = "category")
	private String category;

	private int imgExists;

	private String imgName;

	private String spriteName;

	private String spriteImage;

	private int counter;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getPhNum1() {
		return phNum1;
	}

	public void setPhNum1(String phNum1) {
		this.phNum1 = phNum1;
	}

	public String getPhNum2() {
		return phNum2;
	}

	public void setPhNum2(String phNum2) {
		this.phNum2 = phNum2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getImgExists() {
		return imgExists;
	}

	public void setImgExists(int imgExists) {
		this.imgExists = imgExists;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getSpriteName() {
		return spriteName;
	}

	public void setSpriteName(String spriteName) {
		this.spriteName = spriteName;
	}

	public String getSpriteImage() {
		return spriteImage;
	}

	public void setSpriteImage(String spriteImage) {
		this.spriteImage = spriteImage;
	}

	public String getIndxCatg() {
		return indxCatg;
	}

	public void setIndxCatg(String indxCatg) {
		this.indxCatg = indxCatg;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
