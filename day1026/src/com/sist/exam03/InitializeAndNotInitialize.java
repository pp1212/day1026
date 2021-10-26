package com.sist.exam03;

class Person{
	public Person(String name) {
		
	}
}

public class InitializeAndNotInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("홍길동");
		//Person p2 = new Person();		전달해줘야 하는데 안 전달해주는 것과 null은 다름
		
		int a = 0;	//0 이라는 값으로 초기화
		int b;		//변수만 선언했지 아무 값도 담기지 않음,이 상태로는 사용할 수 없음
		
		String c = null;	//이것은 null이라고 초기화 된 것임
		String d;			//변수만 선언했지 아무 값도 담기지 않음,이 상태로는 사용할 수 없음(메소드에게 줄 수 없음)
		
		
		
	}

}
