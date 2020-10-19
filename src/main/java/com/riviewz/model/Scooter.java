package com.riviewz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scooter_list")
public class Scooter extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String indxCatg;
	
	@Column(name = "scooter_name")
	private String name;

	private String mfgName;

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

	public String getMfgName() {
		return mfgName;
	}

	public void setMfgName(String mfgName) {
		this.mfgName = mfgName;
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
