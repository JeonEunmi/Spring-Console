package com.test029;

public class HelloWorldA {

	// 필드 선언
	private HelloWorldB hello;

	// setter에 의한 의존주입 설정
	// ->필드 초기화 역할
	// ->외부(스프링)에서 실행에 필요한 자료(객체)들을 제공한다
	// ->의존주입(Dependency Injection, DI)
	public void setHello(HelloWorldB hello) {
		this.hello = hello;
	}

	public void getMessage() {
		//HelloWorldB 객체의 getMessage() 메소드를 호출
		this.hello.getMessage();
	}
}
