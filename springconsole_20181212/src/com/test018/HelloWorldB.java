package com.test018;

public class HelloWorldB {

	// 필드 선언
	private String message;

	// setter에 의한 의존주입 설정
	// ->필드 초기화 역할
	// ->외부(스프링)에서 실행에 필요한 자료(객체)들을 제공한다
	// ->의존주입(Dependency Injection, DI)
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + this.message);
	}

	//toString() 메소드 오버라이딩
	// -> 자동 호출되는 메소드
	public String toString() {
		return this.message;
	}
}