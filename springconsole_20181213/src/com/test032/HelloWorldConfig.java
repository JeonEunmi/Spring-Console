package com.test032;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* 
@Configuration ������̼��� ����ؼ�
ȯ�� ���� ������ Java �ڵ�� ǥ���Ѵ�
Beans.xml ��� ����ϴ� ��� 
*/
@Configuration
public class HelloWorldConfig {

	/* 
	������ �����ӿ�ũ�� ������ Ŭ���� ���� ����
	-> @Bean ������̼� ��� 
	Spring Autowiring 'byType'
	-> �ڷ����� ��ġ�ϴ� ��ü�� Ž���ؼ� �ڵ� ����
	*/
	
	@Bean(autowire=Autowire.BY_TYPE)
	public HelloWorldA helloWorldA() {
		HelloWorldA temp = new HelloWorldA();
		/* HelloWorldB ��ü�� ���� �������� ���� */
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
