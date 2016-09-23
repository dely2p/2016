package com.moaboa.dto;

public class ShowTimeDTO {
	/*Member Variable*/
	private int sno; // 사영시간 번호
	private int mno; // 영화 번호
	private String sTime; // 상영시간
	private String interpark; // 인터파크 url
	private String theaterName; // 극장명
	
	/*Constructor*/
	public ShowTimeDTO(){}
	public ShowTimeDTO(int sno, int mno, String sTime, String interpark, String theaterName) {
		super();
		this.sno = sno;
		this.mno = mno;
		this.sTime = sTime;
		this.interpark = interpark;
		this.theaterName = theaterName;
	}
		
	/*Get/Set Method*/
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String getInterpark() {
		return interpark;
	}
	public void setInterpark(String interpark) {
		this.interpark = interpark;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
}
