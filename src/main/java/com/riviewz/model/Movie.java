package com.riviewz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_list")
public class Movie extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String indxCatg;

	@Column(name = "movie_name")
	private String movieName;
	
	private String language;

	private String director;

	private String cast;

	private String genre;

	private String year;

	private String catg;

	private String musicOrSongs;

	private int latest;

	private int imgExists;

	private String imgName;

	private String spriteName;

	private String spriteImage;

	private int counter;

	public int getId() {
		return id;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getDirector() {
		return director;
	}

	public String getCast() {
		return cast;
	}

	public String getGenre() {
		return genre;
	}

	public String getLanguage() {
		return language;
	}

	public String getYear() {
		return year;
	}

	public String getCatg() {
		return catg;
	}

	public String getMusicOrSongs() {
		return musicOrSongs;
	}

	public int getLatest() {
		return latest;
	}

	public int getImgExists() {
		return imgExists;
	}

	public String getImgName() {
		return imgName;
	}

	public String getSpriteName() {
		return spriteName;
	}

	public String getSpriteImage() {
		return spriteImage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setCatg(String catg) {
		this.catg = catg;
	}

	public void setMusicOrSongs(String musicOrSongs) {
		this.musicOrSongs = musicOrSongs;
	}

	public void setLatest(int latest) {
		this.latest = latest;
	}

	public void setImgExists(int imgExists) {
		this.imgExists = imgExists;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public void setSpriteName(String spriteName) {
		this.spriteName = spriteName;
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
