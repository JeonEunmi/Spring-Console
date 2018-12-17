package com.test021;

import java.util.Map;

public class HelloWorldA {

	// �ʵ� ����
	private Map<String, HelloWorldB> message;

	// setter�� ���� �������� ����
	// ->�ʵ� �ʱ�ȭ ����
	// ->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�
	// ->��������(Dependency Injection, DI)
	public void setMessage(Map<String, HelloWorldB> message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.message.toString());
	}

}