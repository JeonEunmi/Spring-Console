package com.test021;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		//Spring Framework 작동 순서
		/*
		1. 스프링이 사용하는 메모리 영역 준비
		   - ApplicationContext
		2. 관리하고자 하는 객체에 대한 정보 확인용 설정 파일
		   - xml
		3. 설정 파일을 근거로 객체 탐색 및 객체 생성
		4. 특정 객체가 다른 객체를 필요로 하는 경우 의존주입 실행
		5. 특정 객체에 의한 애플리케이션 진행
		*/
		

		//특정 객체의 생성과 소멸을 관리하는 Spring 전용 객체 준비
		//->IoC(Inversion of Control) 컨테이너
		//주의) Beans.xml 파일을 com.test016 패키지 안에 위치시킨다
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test021/Beans.xml");
		
		//특정 객체에 의한 애플리케이션 진행
		//->특정 객체 요청은 getBean("id식별자") 메소드 사용
		//주의) 사용자는 특정 객체의 생성과 소멸에 관여하지 않는다.
		HelloWorldA obj1 = (HelloWorldA) context.getBean("helloWorldA");
		obj1.getMessage();
		
		//IoC(Inversion of Control) 컨테이너 소멸 요청
		((ClassPathXmlApplicationContext)context).close();

	}

}
