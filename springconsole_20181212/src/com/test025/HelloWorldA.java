package com.test025;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldA {

	// �ʵ� ����
	private HelloWorldB hello;

	// @Autowired ������̼� ���� �߰�
	// setter�� ���� �������� ����
	// ->�ʵ� �ʱ�ȭ ����
	// ->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�.
	// ->��������(Dependency Injection, DI)
	@Autowired
	public void setHello(HelloWorldB hello) {
		this.hello = hello;
	}

	public void getMessage() {
		//HelloWorldB ��ü�� getMessage() �޼ҵ带 ȣ��
		this.hello.getMessage();
	}

}