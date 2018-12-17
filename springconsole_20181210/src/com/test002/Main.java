package com.test002;

import org.springframework.beans.factory.InitializingBean; 
import org.springframework.beans.factory.xml.XmlBeanFactory; 
import org.springframework.core.io.ClassPathResource;  

public class Main {

	public static void main(String[] args) {
		
		//Spring Framework
		/*
		1. Java 기반 응용 프로그램 작성의 기반이 되는 설정
		2. 경량 프레임워크 - 기본적인 틀만 제공하고, 나머지 기능 추가는 사용자 지정
		3. 다른 프레임워크 결합 사용 가능
		4. 프로젝트 전체의 기본 구조 제공
		5. POJO 기반의 구성
		6. 의존성 주입(DI)를 통한 객체의 관계 구성
		7. AOP 지원
		8. 웹 MVC 구조 지원
		*/

		
		//Spring Framework 작동 순서
		/*
		1. 스프링이 사용하는 메모리 영역 준비
		   - Spring BeanFactory Container
		2. 관리하고자 하는 객체에 대한 정보 확인용 설정 파일
		   - xml
		3. 설정 파일을 근거로 객체 탐색 및 객체 생성
		4. 특정 객체가 다른 객체를 필요로 하는 경우 의존주입 실행
		5. 특정 객체에 의한 애플리케이션 진행
		*/
		
		//Spring Console 환경 설정
		//->Spring library 추가 지정 필요
		
		//특정 객체의 생성과 소멸을 관리하는 Spring 전용 객체 준비
		//->IoC(Inversion of Control) 컨테이너
		//주의) Beans.xml 파일을 src 폴더 안에 위치시킨다
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("com/test002/Beans.xml"));
		
		//특정 객체에 의한 애플리케이션 진행
		//->특정 객체 요청은 getBean("id식별자") 메소드 사용
		//주의) 사용자는 특정 객체의 생성과 소멸에 관여하지 않는다.
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");   
		obj.getMessage();
		
		//IoC(Inversion of Control) 컨테이너 소멸 요청
		
		
		

	}

}
