package com.sist.exam04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DibvideByZeroTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int number1, number2, result;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수:");
			number1 = sc.nextInt();
			
			System.out.print("두 번째 정수:");
			number2 = sc.nextInt();
			
			result = number1 / number2;
			System.out.println(result);
		}catch(InputMismatchException e) {
			//System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}catch(ArithmeticException e) {
			//System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("작업완료");
		}
	}

}
