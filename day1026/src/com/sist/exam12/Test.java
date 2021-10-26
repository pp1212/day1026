package com.sist.exam12;

import com.sist.exam10.CountDown;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountDown c = new CountDown();
		CountDownEvent c2 = new CountDownEvent(2, "연결 장치 분리!");
		CountDownEvent c3 = new CountDownEvent(20, "발사!!");
		
		c.start();
		c2.start();
		c3.start();
	}

}
