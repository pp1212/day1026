package com.sist.exam01;

//인출금액이 잔액보다 부족한 경우 발생시키기 위한 사용자정의 예외
public class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}
