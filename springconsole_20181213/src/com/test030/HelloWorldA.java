package com.test030;

public class HelloWorldA {

	// �ʵ� ����
	private HelloWorldB hello;

	// �����ڿ� ���� �������� ����
	// ->�ʵ� �ʱ�ȭ ����
	// ->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�
	// ->��������(Dependency Injection, DI)
	public HelloWorldA(HelloWorldB hello) {
		this.hello = hello;
	}

	public void getMessage() {
		
		//HelloWorldB ��ü�� getMessage() �޼ҵ� ȣ��
		this.hello.getMessage();
		
	}
	
}
