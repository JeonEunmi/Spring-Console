package com.test023;

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