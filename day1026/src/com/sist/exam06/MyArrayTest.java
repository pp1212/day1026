package com.sist.exam06;

public class MyArrayTest {

	public static void main(String[] args) {
		
		try {
			MyArray array = new MyArray();
			System.out.println("�迭�� ���:"+array.getAverage());
			
		}catch(NegativeArraySizeException e) {
			System.out.println("���ܹ߻�: �迭�� ũ��� ������ �� �� �����!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�: �迭�� �ε��� ������ �Ѿ����ϴ�!");
		}catch(NullPointerException e) {
			System.out.println("���ܹ߻�: �迭�� �������� �ʾҽ��ϴ�!");
		}catch(ArithmeticException e) {
			System.out.println("���ܹ߻�: �迭�� �����Ͱ� �ϳ��� �����!");
		}
	}
	

}



/*
 1)�� ���α׷����� ArithmeticException�� ���� �߻��� �� �ֳ�? 
  	=> �迭�� ���̰� 0�� �� 
  		avg = sum / data.length; ���⼭ �߻�
  		
 2)NegativeArraySizeException
 	=> �迭�� ũ�Ⱑ ������ ��
 	
 3)ArrayIndexOutOfBoundsException
 	=> �迭�� �ε��� ������ �Ѵ� �ε����� �����Ϸ��� �� ��
 	
 4)NullPointerException
 	=> �迭������ �����ϱ⸸ �ϰ� �迭�� �������� �ʰ� ����Ϸ��� �� ��
 */
 