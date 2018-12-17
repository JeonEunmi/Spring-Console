package com.test001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		7. AOP 지원ㅋ
		8. 웹 MVC 구조 지원
		*/


		//Spring Console 환경 설정
		//->Spring library 추가 지정 필요
		/*
		C:\externalLibrary\spring-aop-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-aspects-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-beans-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-context-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-context-support-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-core-4.1.6.RELEASE.jar
		C:\externalLibrary\spring-expression-4.1.6.RELEASE.jar
		C:\externalLibrary\commons-logging-1.2.jar
		*/
		
		//스프링 모듈 구성
		/*
		aop : AOP Alliance에 호환되는 AOP 구현을 제공
		aspects : AspectJ와의 통합을 제공
		asm : ASM 라이브러리를 재패키징 한 모듈(asm은 자바 바이트코드 조작에 사용되는 라이브러리)
		beans : BeanFactory 인터페이스를 통해 구현
		context : core, beans 모듈을 확장 국제화 이벤트, 리소스 로딩, 서블릿 컨테이너를 위한 컨텍스트 생성등의 기능을 추가로 제공. ApplicationContext 인터페이스를 통해 구현
		context.support : Ehcache, 메일 스케쥴링, UI의 Velocity 지원 기능을 제공 
		core : DI 기능을 비롯한 프레임워크의 기반 제공
		expression : 객체에 접근, 조작하기 위한 표현언어제공. JSP 2.1 규약에 명시된 통합 EL 확장
		web : 파일업로드, Locale 처리등 웹을 위한 통합 기능
		web.servlet : 스프링 MVC 제공. JSP, Velocity에 대한 뷰 연동 지원
		web.struts : 스프링과 스트러츠 연동
		web.portlet : 포틀릿 환경에서 사용되는 MVC 구현을 제공
		transaction : AOP를 이용한 선언적 트랜잭션, 코드를 이용한 트랜잭션기능 제공
		jdbc : JDBC를 위한 추상 레이어 제공
		orm : 하이버네이트, JPA, mybatis, jdo 등 orm api를 위한 통합 레이어 제공. 스프링의 트랜잭션 관리와의 연동 지원
		oxm : 객체와 xml 사이의 매핑을 처리하기 위한 추상 레이어를 제공
		jms : jms의 메시지를 생성하고 수신하는 기능을 제공
		test : JUnit이나 TestNG를 이용한 스프링 컴포넌트의 테스트 지원
		*/
		
		
		
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
		
		//Spring Console 환경 설정
		//->Spring library 추가 지정 필요
		
		//특정 객체의 생성과 소멸을 관리하는 Spring 전용 객체 준비
		//->IoC(Inversion of Control) 컨테이너
		//주의) Beans.xml 파일을 src 폴더 안에 위치시킨다
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test001/Beans.xml");
		
		//특정 객체에 의한 애플리케이션 진행
		//->특정 객체 요청은 getBean("id식별자") 메소드 사용
		//주의) 사용자는 특정 객체의 생성과 소멸에 관여하지 않는다.
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.getMessage();
		
		//IoC(Inversion of Control) 컨테이너 소멸 요청
		((ClassPathXmlApplicationContext)context).close();

	}

}
