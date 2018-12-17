package com.test032;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 
@Configuration 어노테이션을 사용해서
환경 설정 정보를 Java 코드로 표현한다
Beans.xml 대신 사용하는 방법 
*/
@Configuration
public class HelloWorldConfig {

	/* 
	스프링 프레임워크가 관리할 클래스 정보 설정
	-> @Bean 어노테이션 사용 
	Spring Autowiring 'byType'
	-> 자료형이 일치하는 객체를 탐색해서 자동 연결
	*/
	
	@Bean(autowire=Autowire.BY_TYPE)
	public HelloWorldA helloWorldA() {
		HelloWorldA temp = new HelloWorldA();
		/* HelloWorldB 객체에 대한 의존주입 설정 */
		/* temp.setHello( helloWorldB() ); */
		return temp;
	}
	
	@Bean
	public HelloWorldB helloWorldB() {
		HelloWorldB temp = new HelloWorldB();
		temp.setMessage("Hello, World!");
		return temp;
	}

}
