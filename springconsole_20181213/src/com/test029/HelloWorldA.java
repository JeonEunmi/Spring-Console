package com.test029;

public class HelloWorldA {

	// �ʵ� ����
	private HelloWorldB hello;

	// setter�� ���� �������� ����
	// ->�ʵ� �ʱ�ȭ ����
	// ->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�
	// ->��������(Dependency Injection, DI)
	public void setHello(HelloWorldB hello) {
		this.hello = hello;
	}

	public void getMessage() {
		//HelloWorldB ��ü�� getMessage() �޼ҵ带 ȣ��
		this.hello.getMessage();
	}
}
