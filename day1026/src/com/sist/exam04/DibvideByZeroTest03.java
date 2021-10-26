package com.sist.exam04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DibvideByZeroTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int number1, number2, result;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수:");
			number1 = sc.nextInt();
			
			System.out.print("두 번째 정수:");
			number2 = sc.nextInt();
			
			result = quotient(number1, number2);
			System.out.println(result);
		}catch(DivideByZeroException e) {
			//e.printStackTrace();
			System.out.println("예외발생:"+e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			System.out.println("작업완료");
		}
	
	}

	public static int quotient(int numerator,int denominator) throws DivideByZeroException{
		if(denominator == 0) {
			throw new DivideByZeroException("분모가 0이 될 수 없습니다!");
		}
		return numerator/denominator;
	}
}
