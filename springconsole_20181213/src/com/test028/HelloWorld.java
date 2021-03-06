package com.test028;

public class HelloWorld {

	//필드 선언
	private String message;

	//setter에 의한 의존주입 설정
	//-> 필드 초기화 역할
	//-> 외부에서 실행에 필요한 자료(객체)들을 제공한다.
	//-> 의존주입(Dependency Injection, DI)
	public void setMessage(String message) {
		this.message = message;
	}

	//
	public void getMessage(){
	      System.out.println("Your Message : " + message);
	}

	// 객체 생성시 자동 호출되는 메소드
	// -> @Bean 어노테이션에 선언된 init-method 속성 설정
	public void init() {
		System.out.println("Bean is going through init.");
	}

	// 객체 소멸시 자동 호출되는 메소드
	// -> @Bean에 선언된 destroy-method 속성 설정
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
	      
}
