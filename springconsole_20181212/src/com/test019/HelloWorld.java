package com.test019;

import java.util.Set;

public class HelloWorld {

	// �ʵ� ����
	private Set<String> message;

	// setter�� ���� �������� ����
	// ->�ʵ� �ʱ�ȭ ����
	// ->�ܺ�(������)���� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�
	// ->��������(Dependency Injection, DI)
	public void setMessage(Set<String> message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.message.toString());
	}

	// ��ü ������ �ڵ� ȣ��Ǵ� �޼ҵ�
	// -> Beans.xml�� ����� init-method �Ӽ� ����
	public void init() {
		System.out.println("Bean is going through init.");
	}

	// ��ü �Ҹ�� �ڵ� ȣ��Ǵ� �޼ҵ�
	// -> Beans.xml�� ����� destroy-method �Ӽ� ����
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}