package com.sist.exam01;

//����ݾ��� �ܾ׺��� ������ ��� �߻���Ű�� ���� ��������� ����
public class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String msg) {
		super(msg);
	}
}
