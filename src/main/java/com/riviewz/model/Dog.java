package com.riviewz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dog_list")
public class Dog extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String indxCatg;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "dog_name")
	private String name;

	@Column(name = "family")
	private String family;

	@Column(name = "area_of_origin")
	private String areaOfOrigin;

	@Column(name = "date_of_origin")
	private String dateOfOrigin;

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

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getAreaOfOrigin() {
		return areaOfOrigin;
	}

	public void setAreaOfOrigin(String areaOfOrigin) {
		this.areaOfOrigin = areaOfOrigin;
	}

	public String getDateOfOrigin() {
		return dateOfOrigin;
	}

	public void setDateOfOrigin(String dateOfOrigin) {
		this.dateOfOrigin = dateOfOrigin;
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
