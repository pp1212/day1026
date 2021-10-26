package com.sist.exam04;

import java.util.Scanner;

public class DibvideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수:");
		number1 = sc.nextInt();
		
		System.out.print("두 번째 정수:");
		number2 = sc.nextInt();
		
		result = number1 / number2;
		System.out.println(result);
	}

}
//20,5		=> 4
//20,abc	=> java.util.InputMismatchException
//				문자열 abc를 number2에 저장할 수 없음.입력한 값이 저장하기 위한 변수와 자료형이 맞지 않음
//20,0		=> java.lang.ArithmeticException: / by zero
//				분모가 0이 될수는 없어서 발생하는 예외