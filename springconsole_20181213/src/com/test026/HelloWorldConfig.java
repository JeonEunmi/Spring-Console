package com.test026;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

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
	
	@Bean
	public HelloWorld helloWorld() {
		HelloWorld temp = new HelloWorld();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}
