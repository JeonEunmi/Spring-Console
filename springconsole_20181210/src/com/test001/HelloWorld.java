package com.test001;

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
	      
}
