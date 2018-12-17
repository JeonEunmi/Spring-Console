package com.test028;

public class HelloWorld {

	//�ʵ� ����
	private String message;

	//setter�� ���� �������� ����
	//-> �ʵ� �ʱ�ȭ ����
	//-> �ܺο��� ���࿡ �ʿ��� �ڷ�(��ü)���� �����Ѵ�.
	//-> ��������(Dependency Injection, DI)
	public void setMessage(String message) {
		this.message = message;
	}

	//
	public void getMessage(){
	      System.out.println("Your Message : " + message);
	}

	// ��ü ������ �ڵ� ȣ��Ǵ� �޼ҵ�
	// -> @Bean ������̼ǿ� ����� init-method �Ӽ� ����
	public void init() {
		System.out.println("Bean is going through init.");
	}

	// ��ü �Ҹ�� �ڵ� ȣ��Ǵ� �޼ҵ�
	// -> @Bean�� ����� destroy-method �Ӽ� ����
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
	      
}
