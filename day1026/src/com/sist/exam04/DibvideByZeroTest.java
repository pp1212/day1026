package com.sist.exam04;

import java.util.Scanner;

public class DibvideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ����:");
		number1 = sc.nextInt();
		
		System.out.print("�� ��° ����:");
		number2 = sc.nextInt();
		
		result = number1 / number2;
		System.out.println(result);
	}

}
//20,5		=> 4
//20,abc	=> java.util.InputMismatchException
//				���ڿ� abc�� number2�� ������ �� ����.�Է��� ���� �����ϱ� ���� ������ �ڷ����� ���� ����
//20,0		=> java.lang.ArithmeticException: / by zero
//				�и� 0�� �ɼ��� ��� �߻��ϴ� ����