package com.test021;

public class HelloWorldB {

	// �ʵ� ����
	private String message;

	// setter�� ���� �������� ����
	// ->�ʵ� �ʱ�ȭ ����
	// ->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�
	// ->��������(Dependency Injection, DI)
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.message);
	}

	//toString() �޼ҵ� �������̵�
	// -> �ڵ� ȣ��Ǵ� �޼ҵ�
	public String toString() {
		return this.message;
	}
}