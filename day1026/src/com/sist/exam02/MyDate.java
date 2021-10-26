package com.sist.exam02;

import java.util.StringTokenizer;

public class MyDate {

	private int year;
	private int month;
	private int date;
	
	//"년/월/일"
	public MyDate(String data) throws IllegalArgumentException{
		if(data == null) {
			throw new IllegalArgumentException("날짜데이터가 전달되지 않았습니다.");
		}
	
		StringTokenizer st = new StringTokenizer(data,"/");
		year = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken());
		date = Integer.parseInt(st.nextToken());
	}

	//출력하기 위해서 getter만 생성
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	
}
