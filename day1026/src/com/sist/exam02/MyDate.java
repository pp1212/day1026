package com.sist.exam02;

import java.util.StringTokenizer;

public class MyDate {

	private int year;
	private int month;
	private int date;
	
	//"��/��/��"
	public MyDate(String data) throws IllegalArgumentException{
		if(data == null) {
			throw new IllegalArgumentException("��¥�����Ͱ� ���޵��� �ʾҽ��ϴ�.");
		}
	
		StringTokenizer st = new StringTokenizer(data,"/");
		year = Integer.parseInt(st.nextToken());
		month = Integer.parseInt(st.nextToken());
		date = Integer.parseInt(st.nextToken());
	}

	//����ϱ� ���ؼ� getter�� ����
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
