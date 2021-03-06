package com.sist.game;

import java.util.Random;

public class Enermy extends GraphicObject {
	
	//적이 x축으로 움직이는 간격을 위한 변수
	//맨처음에는 오른쪽 끝에서 왼쪽으로 움직이게 하기 위하여 음수 설정
	int dx = -10;
	
	//생성시에 적으로 표현할 그래픽파일이름을 매개변수로 전달받아 부모클래스의 생성자에게 전달
	public Enermy(String name) {
		super(name);
		
		//맨처음에 프로그램을 실행하였을 때 적의 위치를 오른쪽 상단에 위치시키기 위하여
		//x=500, y=0으로 설정
		x = 500;
		y = 0;
	}
	
	
	public void update() {
		
		//x좌표를 dx만큼 변경시킴
		x += dx;
		Random r = new Random();
		
		
		//만약 왼쪽끝에 도달하면 오른쪽으로 이동시키기 위하여 dx를 양수로 만듬
		if(x < 0) {
			//dx = +10;
			dx = r.nextInt(30);
		}
		
		//만약 오른쪽끝에 도달하면 다시 왼쪽으로 이동시키기 위하여 dx를 음수로 만듬
		if(x > 500) {
			//dx = -10;
			dx = -r.nextInt(30);
		}
		
		
	}
}
