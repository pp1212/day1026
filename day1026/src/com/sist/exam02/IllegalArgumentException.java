package com.sist.exam02;

//MyDate 객체 생성시에는 "년/월/일" 형태의 문자열을 전달받아야 하는데 만약 null이 오면 발생시킬 예외
public class IllegalArgumentException extends Exception {
	public IllegalArgumentException(String msg) {
		super(msg);
	}
}
