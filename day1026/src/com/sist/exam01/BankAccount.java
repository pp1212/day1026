package com.sist.exam01;

public class BankAccount {
	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%d원을 입금하여 잔액은 %d원이 되었습니다.\n",amount,balance);
	}
	
	public void withdraw(int amount) throws NegativeBalanceException {
		//인출액이 잔액보다 더 크다면 사용자정의 예외인 NegativeBalanceException 생성
		if(amount > balance) {
			throw new NegativeBalanceException("잔액이 부족합니다.");
		}
		
		balance -= amount;
		System.out.printf("%d원을 인출하여 잔액은 %d원이 되었습니다.\n",amount,balance);
	}
}
