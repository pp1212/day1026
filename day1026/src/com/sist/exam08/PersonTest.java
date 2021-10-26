package com.sist.exam08;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("김수연");
		Person p2 = new Person("최현호");
		Person p3 = new Person("윤태인");
		
		p1.start();
		p2.start();
		p3.start();
		
		//p1.run();
		//p2.run();
		//p3.run();
		
		//쓰레드를 가동(동시에 공평하게 실행 해 봐요) 시키려면 "start()"메소드 호출해야 함
		//그런데 start를 호출하지 않고 run을 직접 호출하면
		//쓰레드가 가동(공평하게 실행) 되지 않고 일반 메소드처럼 동작
		//호출한 순서대로 실행
	}
}
