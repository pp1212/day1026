package com.sist.exam08;

public class Person extends Thread {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("안녕, "+name+"===>"+i);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
			}
		}
	}
	
	
}
//PersonTest의 main메소드에서 
//3개의 Person객체 생성한 다음
//쓰레드 가동