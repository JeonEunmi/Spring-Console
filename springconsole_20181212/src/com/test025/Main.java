package com.test025;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		

		//특정 객체의 생성과 소멸을 관리하는 Spring 전용 객체 준비
		//->IoC(Inversion of Control) 컨테이너
		//주의) Beans.xml 파일을 com.test005 패키지 안에 위치시킨다
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test025/Beans.xml");
		
		//특정 객체에 의한 애플리케이션 진행
		//->특정 객체 요청은 getBean("id식별자") 메소드 사용
		//주의) 사용자는 특정 객체의 생성과 소멸에 관여하지 않는다.
		HelloWorldA obj1 = (HelloWorldA) context.getBean("helloWorldA");
		obj1.getMessage();
		
		//IoC(Inversion of Control) 컨테이너 소멸 요청
		((ClassPathXmlApplicationContext)context).close();

	}

}
