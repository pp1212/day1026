package com.sist.exam11;

public class CountDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountDown c = new CountDown();
		Thread t = new Thread(c);
		t.start();
	}

}
