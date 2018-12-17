package com.test027;

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
	@Scope(value="prototype")
	public HelloWorld helloWorld() {
		HelloWorld temp = new HelloWorld();
		temp.setMessage("Hello, world!");
		return temp;
	}

	

}
