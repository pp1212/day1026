package com.sist.exam12;

public class CountDownEvent extends Thread {

	private int delay;
	private String msg;
	
	public CountDownEvent(int delay,String msg){
		this.delay = delay*1000;
		this.msg = msg;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(delay);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(msg);
		
	}

	
}
