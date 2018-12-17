package com.test031;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

/*
 * @configuration 어노테이션을 사용해서 환경 설정 정보를
 * Java 코드로 표현한다.
 * beans.xml 대신 사용하는 방법!
 */
public class HelloWorldConfig {

	/*
	 * 스프링 프레임워크가 관리할 클래스 정보 설정 -> @Bean 어노테이션 사용
	 * setter 방식 의존주입 지정 -> setter 메소드 호출 시 매개변수를 통해서 지정
	 */
	
	
	/*
	@Bean 어노테이션 사용
	Spring Autowiring 'byName'
	-> 식별자가 일치하는 객체를 탐색해서 자동 연결
	*/
	@Bean(autowire=Autowire.BY_NAME)
	public HelloWorldA helloWorldA() {
		/*HelloWorldB 객체에 대한 의존주입 설정*/
		HelloWorldA temp = new HelloWorldA( helloWorldB() );
		return temp;
	}
	
	@Bean()
	public HelloWorldB helloWorldB() {
		HelloWorldB temp = new HelloWorldB();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}
