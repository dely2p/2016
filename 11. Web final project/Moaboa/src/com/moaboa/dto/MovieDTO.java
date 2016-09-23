package com.moaboa.dto;

public class MovieDTO {
	/*Member Variable*/
	private int mno; // 영화 번호
	private String mName; // 영화 제목
	private String mImage; // 영화 대표 이미지 URL
	private String preView; // 예고편 URL
	private String mGenre; // 영화 장르
	private String director; // 영화 감독
	private String actor; // 출연 배우
	private String mDate; // 개봉 일자

	/*Constructor*/
	public MovieDTO(){}
	public MovieDTO(int mno, String mName, String mImage, String preView, String mGenre, String director, String actor,
			String mDate) {
		super();
		this.mno = mno;
		this.mName = mName;
		this.mImage = mImage;
		this.preView = preView;
		this.mGenre = mGenre;
		this.director = director;
		this.actor = actor;
		this.mDate = mDate;
	}
	
	/*Get/Set Method*/
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmImage() {
		return mImage;
	}
	public void setmImage(String mImage) {
		this.mImage = mImage;
	}
	public String getPreView() {
		return preView;
	}
	public void setPreView(String preView) {
		this.preView = preView;
	}
	public String getmGenre() {
		return mGenre;
	}
	public void setmGenre(String mGenre) {
		this.mGenre = mGenre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
	
}
