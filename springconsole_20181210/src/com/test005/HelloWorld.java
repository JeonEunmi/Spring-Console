package com.test005;

public class HelloWorld {
	
	//�ʵ� ����
	private String message;

	//setter�� ���� �������� ����
	//->�ʵ� �ʱ�ȭ ����
	//->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�
	//->��������(Dependency Injection, DI)
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.message);
	}
}