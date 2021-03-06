package com.sist.game;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Graphics;

//적,미사일,우주선을 동시에(한꺼번에) 담을 수 있는 패널클래스를 만듬
//패널의 키보드가 눌러지는 이벤트를 처리하기 위하여 KetListener도 구현
//스페이스-미사일 발사, 방향키-우주선 위치 움직임
public class MyPanel extends JPanel implements KeyListener{
	//MyPanel과 Enermy,SpaceShip,Missile은 has a관계 -> 객체들을 멤버변수로 가짐
	
	//ArrayList<Enermy> list = new ArrayList<Enermy>();
	//적,미사일,우주선을 패널에 맴버변수로 선언
	Enermy enermy;
	SpaceShip spaceship;
	Missile missile;
	
	//생성자에서 즉,패널이 생성됨과 동시에 동작하여
	public MyPanel() {
		super();
		this.addKeyListener(this);		//패널의 키보드이벤트를 등록
		this.requestFocus();			//패널의 키보드 요청을 설정	A
		setFocusable(true);				//패널의 포커스를 설정		B
		//패널은 화면구성요소 중에 원래부터 키보드로부터 입력을 받아 들이는 용도가 아니기 때문에
		//키보드로부터 입력을 받아들이게 하려면 패널에 일단은 포커스를 설정해야 함(선택이 되어있어야 입력 가능하기 때문)
		
		enermy = new Enermy("enermy.png");			//이미지파일명을 갖고 적 객체를 생성
		spaceship = new SpaceShip("spaceship.png");	//이미지파일명을 갖고 우주선 객체를 생성
		missile = new Missile("missile.png");		//이미지파일명을 갖고 미사일 객체를 생성
		
		//패널의 구성요소인 적,미사일,우주선이 서로 독립적으로(동시에,공평하게) 움직이도록 하기 위하여
		//멀티쓰레드로 구현
		//적,미사일,우주선이 동시에(공평하게) 움직이게 하는 기능은 다른 곳에서는 쓸 일이 없고
		//이곳 패널에서만 필요
		//이럴때 클래스를 클래스안에 만들 수 있음
		//=>inner class
		class MyThread extends Thread{		//Thread클래스를 상속받아 멀티쓰레드 구현
			public void run() {				//run을 오버라이딩하여 동시에 실행시킬 명령어(들)을 써줌
				while(true) {				//계속 반복하여 적,미사일,우주선이 움직이도록 하기 위하여 while(true) 이용
					enermy.update();		//적을 움직이도록 하기 위하여 적의 위치를 변경하는 메소드를 호출
											//계속 양옆으로 왔다갔다 
					//spaceship.update();	//우주선을 움직이도록 하기 위하여 우주선의 위치를 변경하는 메소드 호출
											//우주선은 키보드가 눌러진 방향으로 한번에 한번 움직이도록 되어있음
											//그래서 호출하지 않아도 됨
					missile.update();		//미사일을 움직이도록 하기 위하여 미사일의 위치를 변경하는 메소드 호출
					repaint();				//적,미사일,우주선의 변경된 위치에 다시 그리기 위한 요청을 함
											//화면에 그래픽을 그려주는 메소드는 paint(paintComponent)메소드
											//사용자가 직접 paint를 호출할 수는 없고
											//repaint를 호출하여 paint를 동작시킬 수 있음
					try {
						Thread.sleep(50);
					}catch(InterruptedException e) {
					}
				}
			}
		}
		
		//적,미사일,우주선이 서로 독립적으로 움직이도록 만든
		//멀티쓰레드 객체 MyThread를 생성
		//Thread와 MyThread는 is a 관계여서 참조 가능
		Thread t = new MyThread();
		
		//쓰레드 가동
		t.start();
	}
	
	
	
	//적,미사일,우주선의 변경된 위치에 그래픽을 다시 그려줌
	//패널에 그래픽을 표현하기 위해서는 paint를 오버라이딩 해줌
	//이 때 매개변수로 전달받은 Graphics에 그래픽을 표현하기 위한 다양한 메소드들이 있음
	public void paint(Graphics g) {		
		super.paint(g);
		
		//그래픽을 그리기 위한 그래픽스의 g를 적,우주선,미사일 에게 전달하여 다시 변경된 위치에 그리도록 함
		enermy.draw(g);			
		spaceship.draw(g);		
		missile.draw(g);
	}
	
	
	
	//패널에서 키보드가 눌러지면
	public void keyPressed(KeyEvent event) {	//KeyEvent event에 눌러진 키보드 정보 갖고 있음
		spaceship.keyPressed(event);		//눌러진 키보드이벤트의 정보를 우주선에게 전달
		
		//눌러진 키보드이벤트의 정보와 우주선의 위치를 미사일에게 전달
		missile.keyPressed(event, spaceship.x, spaceship.y);
	}
	
	//떼었을 때
	public void keyReleased(KeyEvent arg0) {
	}
	
	//누르고 떼는게 한 쌍
	public void keyTyped(KeyEvent arg0) {
	}
}
