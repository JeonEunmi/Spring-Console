package com.test026;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/*
 * @configuration ������̼��� ����ؼ� ȯ�� ���� ������
 * Java �ڵ�� ǥ���Ѵ�.
 * beans.xml ��� ����ϴ� ���!
 */
public class HelloWorldConfig {

	/*
	 * ������ �����ӿ�ũ�� ������ Ŭ���� ���� ���� -> @Bean ������̼� ���
	 * setter ��� �������� ���� -> setter �޼ҵ� ȣ�� �� �Ű������� ���ؼ� ����
	 */
	
	@Bean
	public HelloWorld helloWorld() {
		HelloWorld temp = new HelloWorld();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}
