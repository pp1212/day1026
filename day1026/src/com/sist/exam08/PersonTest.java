package com.sist.exam08;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("�����");
		Person p2 = new Person("����ȣ");
		Person p3 = new Person("������");
		
		p1.start();
		p2.start();
		p3.start();
		
		//p1.run();
		//p2.run();
		//p3.run();
		
		//�����带 ����(���ÿ� �����ϰ� ���� �� ����) ��Ű���� "start()"�޼ҵ� ȣ���ؾ� ��
		//�׷��� start�� ȣ������ �ʰ� run�� ���� ȣ���ϸ�
		//�����尡 ����(�����ϰ� ����) ���� �ʰ� �Ϲ� �޼ҵ�ó�� ����
		//ȣ���� ������� ����
	}
}
