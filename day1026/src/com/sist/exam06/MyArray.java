package com.sist.exam06;

import java.util.Scanner;

public class MyArray {

	public int []data;
	public MyArray() {
		
		
		data = new int[10];
		//data = new int[0];
		//data = new int[-10];	//-> 음수라서 배열도 안 만들어짐
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<data.length;i++) {
			System.out.printf("%d번째 데이터를 입력하세요==>",i+1);
			data[i] = sc.nextInt();
		}
			
		
		
	}
	
	public double getAverage() {
		
	double avg = 0;
	int sum = 0;
	
		//for(int i=0;i<=data.length;i++) {
		for(int i=0;i<data.length;i++) {
			sum += data[i];
		}
		avg = sum / data.length;
	
	return avg;
	
	}
}
